package com.fmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fmc.beans.MessagingService;
import com.fmc.config.MessageConfig;

@Component
public class MessageService {
	
	private MessagingService messagingService;
	
	@Autowired
	public MessageService(@Qualifier("whatsup")MessagingService  messagingService) {
		this.messagingService=messagingService;
	}
	
	  public void sendText(String message) { 
		  messagingService.sendText(message); 
	}
	  public void sendImage(String imageUrl) { messagingService.sendImage(imageUrl); } public
	  void sendVideo(String videoUrl) { messagingService.sendVideo(videoUrl); }
	 

}
