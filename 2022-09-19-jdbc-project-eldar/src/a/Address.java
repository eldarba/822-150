package a;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "person")
@EqualsAndHashCode(of = "id")
public class Address {

	private int id;
	private String country;
	private String city;
	private String street;
	private int number;
	private Person person;
	
	

}
