package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.auth.JwtUtil;
import app.core.filters.AdminAuthorizatioFilter;
import app.core.filters.AuthenticationFilter;
import app.core.filters.CompanyAuthorizatioFilter;
import app.core.filters.CustomerAuthorizatioFilter;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	FilterRegistrationBean<AuthenticationFilter> authenticationFilter(JwtUtil jwtUtil) {
		FilterRegistrationBean<AuthenticationFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new AuthenticationFilter(jwtUtil));
		regBean.addUrlPatterns("/api/*");
		return regBean;
	}

	@Bean
	FilterRegistrationBean<AdminAuthorizatioFilter> adminAuthFilter() {
		FilterRegistrationBean<AdminAuthorizatioFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new AdminAuthorizatioFilter());
		regBean.addUrlPatterns("/api/admin/*");
		return regBean;
	}

	@Bean
	FilterRegistrationBean<CompanyAuthorizatioFilter> companyAuthFilter() {
		FilterRegistrationBean<CompanyAuthorizatioFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new CompanyAuthorizatioFilter());
		regBean.addUrlPatterns("/api/company/*");
		return regBean;
	}

	@Bean
	FilterRegistrationBean<CustomerAuthorizatioFilter> customerAuthFilter() {
		FilterRegistrationBean<CustomerAuthorizatioFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new CustomerAuthorizatioFilter());
		regBean.addUrlPatterns("/api/customer/*");
		return regBean;
	}

	// for swagger authorization
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("title").version("version").description("description"))
				.addSecurityItem(new SecurityRequirement().addList("my security"))
				.components(new Components().addSecuritySchemes("my security",
						new SecurityScheme().name("my security").type(SecurityScheme.Type.HTTP).scheme("bearer")));
	}

}
