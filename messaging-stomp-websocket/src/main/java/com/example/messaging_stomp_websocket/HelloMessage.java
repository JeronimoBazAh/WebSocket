package com.example.messaging_stomp_websocket;

public class HelloMessage {
	public HelloMessage(String name) {

		this.name = name;
	}

	public HelloMessage() {
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
