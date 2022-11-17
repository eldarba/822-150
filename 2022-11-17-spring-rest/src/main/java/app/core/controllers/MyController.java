package app.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/hello
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}

}
