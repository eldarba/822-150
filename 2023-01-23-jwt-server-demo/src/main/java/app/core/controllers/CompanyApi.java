package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyApi {

	@GetMapping(path = "/add-coupon", headers = { HttpHeaders.AUTHORIZATION })
	public String addCoupon() {
		return "Coupon added";
	}

}
