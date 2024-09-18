package com.webapp_practice4.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSending {

	@Autowired
	private JavaMailSender javamailsender;
	
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(to);
		sm.setSubject(subject);
		sm.setText(message);
		
		javamailsender.send(sm);
		
	}
}
