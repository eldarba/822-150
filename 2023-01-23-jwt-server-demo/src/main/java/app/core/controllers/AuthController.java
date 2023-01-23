package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.core.auth.UserCredentials;
import app.core.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public String login(@RequestBody UserCredentials credentials) {
		return authService.login(credentials);
	}

}
