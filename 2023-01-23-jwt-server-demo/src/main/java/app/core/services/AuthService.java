package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.User;

@Service
public class AuthService {

	@Autowired
	private JwtUtil jwtUtil;

	public String login(UserCredentials credentials) {
		User user = new User(0, credentials.getEmail(), credentials.getPassword(), null, null, null, null);
		String token = jwtUtil.generateToken(user);
		return token;
	}

}
