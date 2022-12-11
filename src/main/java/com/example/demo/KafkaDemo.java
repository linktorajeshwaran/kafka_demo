package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Producer;

@RestController
@RequestMapping("post/")
class KafkaDemo {
	
	@Autowired
	Producer producer;
	
	@RequestMapping(path="messages/{message}")
	void postMessage(@RequestParam String message) {
		producer.produce("test");
	}
	
}