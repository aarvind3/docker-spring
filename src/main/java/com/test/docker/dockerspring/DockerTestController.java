package com.test.docker.dockerspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker/test")
public class DockerTestController {
	
	@RequestMapping(value="/method1")
	public String testMethod(){
		return "app is running using docker";
	}

}
