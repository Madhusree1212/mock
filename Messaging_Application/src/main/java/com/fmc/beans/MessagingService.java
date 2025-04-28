package com.fmc.beans;

import org.springframework.stereotype.Component;

@Component
public interface MessagingService {
	void sendText(String message);
	void sendImage(String imageUrl);
	void sendVideo(String videoUrl);
}
