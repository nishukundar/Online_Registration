package com.webapp_practice4.dto;


public class RegistrationDTO{


private long id;
private String name;
private String email;
private String mobile;


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public void setName(String name){
this.name=name;
}

public String getName(){
return name;
}

public void setEmail(String email){
this.email=email;
}


public String getEmail(){
return email;
}

public void setMobile(String mobile){
this.mobile=mobile;
}

public String getMobile(){
return mobile;
}
}
