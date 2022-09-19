package b;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = "company")
public class Coupon {

	private int id;
	private String title;
	private double price;
	private int quantity;
	private Company company;

}
