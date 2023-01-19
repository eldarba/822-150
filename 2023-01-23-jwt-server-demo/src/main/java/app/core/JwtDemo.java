package app.core;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

public class JwtDemo {

	public static void main(String[] args) {
		System.out.println("JWT");

		// create a JWT builder
		JwtBuilder jwtBuilder = Jwts.builder();

		String token = jwtBuilder

				.claim("name", "Eldar")

				.claim("address", "Tel Aviv")

				.claim("phone", "0002154")

				.compact();

		System.out.println(token);

	}

}
