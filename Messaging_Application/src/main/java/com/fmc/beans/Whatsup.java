package com.fmc.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("whatsup")
//@Primary
public class Whatsup implements MessagingService {

	@Override
	public void sendText(String message) {
		System.out.println("Whatsup sendText message is: "+"Hii ");
	}

	@Override
	public void sendImage(String imageUrl) {
		System.out.println("Whatsup sendImage imageUrl is: "+"www.https://rose.jp");
	}

	@Override
	public void sendVideo(String videoUrl) {
		System.out.println("Whatsup sendVideo videoUrl is: "+"www.https://rose.video");
		
	}

}
