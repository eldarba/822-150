package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=========> filter start");
		// 1. check the request
		if (Math.random() < 0.5) {
			// 2. if ok pass the request up the filter chain
			chain.doFilter(request, response);
		} else {
			// or block the request and send an error
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "you where blocked");
		}

		System.out.println("=========> filter end");
	}

}
