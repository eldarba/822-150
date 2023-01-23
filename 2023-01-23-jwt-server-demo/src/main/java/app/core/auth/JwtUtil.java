package app.core.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import app.core.entities.User;
import app.core.entities.User.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;

@Component
public class JwtUtil extends JwtUtilAbstract<User, Integer> {

	@Override
	public String generateToken(User user) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("email", user.getEmail());
		claims.put("firstName", user.getFirstName());
		claims.put("lastName", user.getLastName());
		claims.put("username", user.getUsername());
		claims.put("role", user.getRole());
		return this.createToken(claims, user.getId()); // id is subject
	}

	@Override
	public User extractUser(String token) throws JwtException {
		Claims claims = this.extractAllClaims(token);
		int id = Integer.parseInt(claims.getSubject());
		String email = claims.get("email", String.class);
		String firstName = claims.get("firstName", String.class);
		String lastName = claims.get("lastName", String.class);
		String username = claims.get("username", String.class);
		Role role = Role.valueOf(claims.get("role", String.class));

		User user = new User(id, email, null, firstName, lastName, username, role);
		return user;
	}

}
