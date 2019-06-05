package org.akj.springboot.authorization.controller;

import java.security.Principal;

import org.akj.springboot.authorization.beans.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TestController {

	@RequestMapping(value = "/api/userInfo", method = RequestMethod.GET)
	@ResponseBody
	public User helloWorld(Principal principal) {

		User user = new User();
		user.setName(principal.getName());
		user.setNickName("Anonymous User");
		user.setEmail("god.galaxy@universal.org");
		return user;
	}
}
