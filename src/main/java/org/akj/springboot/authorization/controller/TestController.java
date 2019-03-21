package org.akj.springboot.authorization.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class TestController {

//	@GetMapping()
//	@ResponseBody
//	public String test() {
//		return "this is testing message";
//	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Principal helloWorld(Principal principal) {
		return principal;
	}
}
