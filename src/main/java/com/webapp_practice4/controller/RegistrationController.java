package com.webapp_practice4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp_practice4.dto.RegistrationDTO;
import com.webapp_practice4.entity.RegistrationEntity;
import com.webapp_practice4.service.RegistrationService;
import com.webapp_practice4.util.EmailSending;

@Controller
public class RegistrationController{

@Autowired
private RegistrationService registrationservice;

@Autowired
private EmailSending emailSending;
//http://localhost:8080/view

@RequestMapping("/view")
public String callingView(){
  return "registration";
}


//@RequestMapping("/saveReg")
//public String saveRegistration(@ModelAttribute RegistrationEntity registration){
// registrationservice.getAllRegDetails(registration);
// return "registration";
//}


//@RequestMapping("/saveReg")
//public String saveRegistration(@ModelAttribute RegistrationDTO registrationdto){
// 
//RegistrationEntity registration = new RegistrationEntity();
//registration.setName(registrationdto.getName());
//registration.setEmail(registrationdto.getEmail());
//registration.setMobile(registrationdto.getMobile());
//
//registrationservice.getAllRegDetails(registration);
//return "registration";
//}

@RequestMapping("/saveReg")
public String saveRegistration(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("mobile") String mobile, Model model){
RegistrationEntity registration = new RegistrationEntity();
registration.setName(name);
registration.setEmail(email);
registration.setMobile(mobile);

registrationservice.getAllRegDetails(registration);
emailSending.sendEmail(email, "Welcome Email", "Hello "+name+" welcome to our group!");
model.addAttribute("msg","Record saved");
return "registration";
}


//http://localhost:8080/list
@RequestMapping("/list")
public String getDataFromService(Model model) {
	List<RegistrationEntity> allDatafromDB = registrationservice.getAllDatafromDB();
	model.addAttribute("registrations", allDatafromDB);
	return "list_jstl";
}


@RequestMapping("/deleteReg")
public String deleteRegistration(@RequestParam long id, Model model) {
	registrationservice.deleteRegistrationById(id);
	
	List<RegistrationEntity> allDatafromDB = registrationservice.getAllDatafromDB();
	model.addAttribute("registrations", allDatafromDB);
	return "list_jstl";
}



@RequestMapping("/getRegById")
public String getRegById(@RequestParam long id, Model model) {
	RegistrationEntity registrations = registrationservice.getRecordById(id);
	model.addAttribute("registrations", registrations);
	return "update";
}

@RequestMapping("/updateData")
public String updateData(@ModelAttribute RegistrationEntity registration, Model model){
	

	registrationservice.getAllRegDetails(registration);

	List<RegistrationEntity> allDatafromDB = registrationservice.getAllDatafromDB();
	model.addAttribute("registrations", allDatafromDB);
	
	return "list_jstl";
}


}