package app.core.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MyController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello";
	}

	@GetMapping("/add")
	public double add(@RequestParam double a, @RequestParam double b) {
		return a + b;
	}

}
