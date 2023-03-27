package app.core.web.fallbacks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbacksController {
	
	@GetMapping("/fallback/serviceA")
	public String fallbackA() {
		return "Gateway Fallback - service A unavailable";
	}

	@GetMapping("/fallback/serviceB")
	public String fallbackB() {
		return "Gateway Fallback - service B unavailable";
	}

}
