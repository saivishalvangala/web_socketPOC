package com.stackroute.websocket_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
public class WebSocketDemoApplication {

	public static void main(String[] args)	 {
		SpringApplication.run(WebSocketDemoApplication.class, args);
	}

}
