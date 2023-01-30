package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.auth.UserCredentials;
import app.core.entities.User;
import app.core.services.AuthService;

@CrossOrigin
@RestController
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/register")
	public String register(@RequestBody User user) {
		return this.authService.register(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody UserCredentials credentials) {
		try {
			return authService.login(credentials);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
		}
	}

}
