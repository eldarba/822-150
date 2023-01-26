package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.entities.User;
import app.core.entities.User.Role;

public class CompanyAuthorizatioFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=========> company filter start");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		User user = (User) httpRequest.getAttribute("user");
		if (user.getRole() == Role.COMPANY) {
			chain.doFilter(httpRequest, httpResponse);
		} else {
			httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "only companies are authorized");
		}

		System.out.println("=========> company filter end");
	}

}
