package com.fmc.beans;

import org.springframework.stereotype.Component;

@Component("telegram")
public class Telegram implements MessagingService{

	@Override
	public void sendText(String message) {
		System.out.println("Telegram  sendText message is: "+"Hii hello");
	}

	@Override
	public void sendImage(String imageUrl) {
		System.out.println("Telegram sendImage imageUrl is: "+"www.https://dse.jpg");
	}

	@Override
	public void sendVideo(String videoUrl) {
		System.out.println("Telegram sendVideo videoUrl is: "+"www.https://dse.video");

	}

}
