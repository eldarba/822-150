package app.core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	
	@GetMapping("/service/a")
	public String handleA() {
		return "Service A";
	}

}
