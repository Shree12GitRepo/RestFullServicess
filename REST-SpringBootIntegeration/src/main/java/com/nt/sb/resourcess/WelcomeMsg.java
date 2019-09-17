package com.nt.sb.resourcess;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	public WelcomeMsg() {
		System.out.println("WelcomeMsg.WelcomeMsg()");
	}
	@GetMapping
	public String Msg() {
		return "Wellcome To REST API in SPRING Boot Env";
	}
}
