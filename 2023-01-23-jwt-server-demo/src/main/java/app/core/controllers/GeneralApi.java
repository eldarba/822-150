package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeneralApi {

	@GetMapping(path = "/greet", headers = { HttpHeaders.AUTHORIZATION })
	public String greet() {
		return "Hello";
	}

}
