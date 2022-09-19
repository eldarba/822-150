package b;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = "coupons")
public class Company {

	private int id;
	private String name;
	private String email;
	private List<Coupon> coupons;

}
