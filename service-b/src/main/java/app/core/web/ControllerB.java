package app.core.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {
	
	@Value("${spring.cloud.consul.discovery.instanceId}")
	private String instanceId;
	
	@GetMapping("/service/b")
	public String handleB() {
		return "From: " + this.instanceId;
	}

}
