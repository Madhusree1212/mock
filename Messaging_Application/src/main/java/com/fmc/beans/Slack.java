package com.fmc.beans;

import org.springframework.stereotype.Component;

@Component("slack")
public class Slack implements MessagingService{

	@Override
	public void sendText(String message) {
        System.out.println("Slack sendText message is: "+"Hello");		
	}

	@Override
	public void sendImage(String imageUrl) {
		System.out.println("Slack sendImage imageUrlis: "+"www.https://doe.jpg");
	}

	@Override
	public void sendVideo(String videoUrl) {
		System.out.println("Slack sendVideo videoUrl: "+"www.https://doe.video");
		
	}

}
