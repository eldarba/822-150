package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerApi {

	@GetMapping(path = "/buy-coupon", headers = { HttpHeaders.AUTHORIZATION })
	public String buyCoupon() {
		return "Coupon bought";
	}

}
