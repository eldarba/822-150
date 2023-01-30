package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.User;
import app.core.repos.UserRepo;

@Service
public class AuthService {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserRepo userRepo;

	public String register(User user) throws Exception {
		// business logic comes here - check user values
		if (!this.userRepo.existsByEmail(user.getEmail())) {
			this.userRepo.save(user);
			return this.jwtUtil.generateToken(user);
		} else {
			throw new Exception("register failed - email already exists: " + user.getEmail());
		}
	}

	public String login(UserCredentials credentials) throws Exception {

		// find if there is a user with this email
		User user = userRepo.findByEmail(credentials.getEmail())
				.orElseThrow(() -> new Exception("user not found. email: " + credentials.getEmail()));

		// if user found check the password
		if (credentials.getPassword().equals(user.getPassword())) {
			String token = jwtUtil.generateToken(user);
			return token;
		} else {
			throw new Exception("wrong email or password");
		}

	}

}
