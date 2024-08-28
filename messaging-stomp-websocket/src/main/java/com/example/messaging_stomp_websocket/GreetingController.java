package com.example.messaging_stomp_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage mensaje) throws Exception{
		Thread.sleep(1000); //simula deley
		
		return new Greeting("Hola " + HtmlUtils.htmlEscape(mensaje.getName()) + "!");
		
		
	}
}
