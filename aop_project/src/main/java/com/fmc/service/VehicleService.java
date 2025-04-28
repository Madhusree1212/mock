package com.fmc.service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.fmc.interface_spreaker.Song;
import com.fmc.interface_spreaker.Speaker;
import com.fmc.interfaces.Tyre;

public class VehicleService {
	private Logger logger = Logger.getLogger(VehicleServices.class.getName());
	@Autowired
	//private Speakers speakers;
	private Tyre tyres;
	private Speaker speakers;
	public String playMusic(boolean vehicleStarted, Song song){
	Instant start = Instant.now();
	logger.info("method execution start");
	String music = null;
	if(vehicleStarted){
	music = speakers.makeSound(song);
	}else{
	logger.log(Level.SEVERE,"Vehicle not started to perform the" +
	" operation");
	}
	logger.info("method execution end");
	Instant finish = Instant.now();
	long timeElapsed = Duration.between(start, finish).toMillis();
	logger.info("Time took to execute the method : "+timeElapsed);
	return music;
	}
	public String moveVehicle(boolean vehicleStarted){
	Instant start = Instant.now();
	logger.info("method execution start");
	String status = null;
	if(vehicleStarted){
	status = tyres.rotate();
	}else{
	logger.log(Level.SEVERE,"Vehicle not started to perform the" +
	" operation");
	}
	logger.info("method execution end");
	Instant finish = Instant.now();
	long timeElapsed = Duration.between(start, finish).toMillis();
	logger.info("Time took to execute the method : "+timeElapsed);
	return status;
	}
	public String applyBrake(boolean vehicleStarted){
	Instant start = Instant.now();
	logger.info("method execution start");
	String status = null;
	if(vehicleStarted){
	status = tyres.stop();
	}else{
	logger.log(Level.SEVERE,"Vehicle not started to perform the" +
	" operation");
	}
	logger.info("method execution end");
	Instant finish = Instant.now();
	long timeElapsed = Duration.between(start, finish).toMillis();
	logger.info("Time took to execute the method : "+timeElapsed);
	return status;
	}
	public Speaker getSpeakers() {
	return getSpeakers();
	}
	public void setSpeakers(Speaker speakers) {
	this.speakers = speakers;
	}
	public Tyre getTyres() {
	return tyres;
	}
	@Autowired
	public void setTyres(Tyre tyres) {
	this.tyres = tyres;
	}
	}


