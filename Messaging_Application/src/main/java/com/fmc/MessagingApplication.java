package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.fmc.config.MessageConfig;
import com.fmc.service.MessageService;


public class MessagingApplication {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageService s1=context.getBean(MessageService.class);
		
		  s1.sendText("hii");
		  s1.sendImage("wwww.https://rose.jpg");
		  s1.sendVideo("www.https://rose.video");
		 	
		
	
	}
}
