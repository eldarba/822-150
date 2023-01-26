package app.core.filters;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import app.core.auth.JwtUtil;
import app.core.entities.User;

public class AuthenticationFilter implements Filter {

	private JwtUtil jwtUtil;

	public AuthenticationFilter(JwtUtil jwtUtil) {
		super();
		this.jwtUtil = jwtUtil;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=========> filter start");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		// 1. check the request

		// get the Authorization header with the schem and JWT
		String auth = httpRequest.getHeader("Authorization");

		if (auth == null) {
			httpResponse.addHeader(HttpHeaders.WWW_AUTHENTICATE, "Bearer \"general api\"");
			httpResponse.sendError(HttpStatus.UNAUTHORIZED.value(), "you need to login");
		} else {
			StringTokenizer tokenizer = new StringTokenizer(auth);
			String schema = tokenizer.nextToken();
			String jwt = tokenizer.nextToken();
			System.out.println(schema);
			System.out.println(jwt);
			// convert the jwt to a User object
			User user = jwtUtil.extractUser(jwt);
			System.out.println(user);

		}

		// pass the request on
		chain.doFilter(httpRequest, response);
		System.out.println("=========> filter end");
	}

//	public static void main(String[] args) {
//		StringTokenizer tokenizer = new StringTokenizer("aaa bbb ccc");
//		System.out.println(tokenizer.nextToken());
//		System.out.println(tokenizer.nextToken());
//		System.out.println(tokenizer.nextToken());
//	}

}
