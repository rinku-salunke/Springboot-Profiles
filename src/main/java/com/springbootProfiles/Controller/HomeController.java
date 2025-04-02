package com.springbootProfiles.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${cjc.msg}")
	String msg;
	@RequestMapping("/")
	public String displayEnvDetails() {
		return "Env   " +msg;
	}
	
}
