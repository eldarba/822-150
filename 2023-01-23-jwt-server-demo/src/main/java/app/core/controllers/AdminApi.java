package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminApi {

	@GetMapping(path = "/add-company", headers = { HttpHeaders.AUTHORIZATION })
	public String addCompany() {
		return "Company added";
	}

}
