package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "topic", groupId = "group1")
	void consumer(String receivedMessage) {
		System.out.println(receivedMessage);
	}
}
