package com.fmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.fmc")
@EnableAspectJAutoProxy
@Configuration
public class VehicleConfig {

}
