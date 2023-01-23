package app.core;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

public class JwtDemo {

	public static void main(String[] args) {
		System.out.println("JWT");

		// 1. create a JWT builder
		JwtBuilder jwtBuilder = Jwts.builder();

		// 2. create the token
		String token = jwtBuilder

				.claim("name", "Eldar") // add a claim to the payload

				.claim("address", "Tel Aviv") // add a claim to the payload

				.claim("phone", "0002154") // add a claim to the payload

				.compact(); // convert to a string JWS

		// 3. print the token
		System.out.println(token);

	}

}
