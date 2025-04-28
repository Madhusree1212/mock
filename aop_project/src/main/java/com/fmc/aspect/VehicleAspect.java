package com.fmc.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VehicleAspect {
	
	@Before("execution(com.fmc.service.vehicleService.*))")
	public void beforesound(Joinpoint joinPoint) {
		System.out.println("Before sound is: "+joinPoint.getThis());
		
	}

}
