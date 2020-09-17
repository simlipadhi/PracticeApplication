package com.learning.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

	@Autowired
	public InitService bean;

	@RequestMapping("projectName")
	String getProjectName() {
		return bean.getProjectName();
	}
}