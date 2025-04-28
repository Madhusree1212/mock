package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.VehicleConfig;
import com.fmc.service.VehicleService;

public class VehicleMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfig.class);
		VehicleService v=context.getBean(VehicleService.class);
		System.out.println(v.getSpeakers());
	}
}
	
