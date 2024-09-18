package com.webapp_practice4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp_practice4.entity.RegistrationEntity;
import com.webapp_practice4.repository.RegistrationRepository;

@Service
public class RegistrationService{

@Autowired
private RegistrationRepository registrationrepository;

public void getAllRegDetails(RegistrationEntity registration){

registrationrepository.save(registration);


}

public List<RegistrationEntity> getAllDatafromDB() {
	List<RegistrationEntity> all = registrationrepository.findAll();
	return all;
}

public void  deleteRegistrationById(long id) {
	registrationrepository.deleteById(id);
}

public RegistrationEntity getRecordById(long id) {
	Optional<RegistrationEntity> byId = registrationrepository.findById(id);
	RegistrationEntity registrationEntity = byId.get();
	return registrationEntity;
	
	
}



}

