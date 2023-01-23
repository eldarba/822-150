package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

	// for swagger authorization
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("title").version("version").description("description"))
				.addSecurityItem(new SecurityRequirement().addList("my security"))
				.components(new Components().addSecuritySchemes("my security",
						new SecurityScheme().name("my security").type(SecurityScheme.Type.HTTP).scheme("bearer")));
	}

}
