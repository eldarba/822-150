package app.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String username;
	private Role role;

	public enum Role {
		ADMIN, COMPANY, CUSTOMER;
	}

}
