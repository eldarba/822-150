package app.core.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "companyCoupon") // used in JPQL queries
@Table(name = "coupons") // used in native queries
@Check(constraints = "price >= 5")
public class Coupon {
	@Id
	@GeneratedValue(generator = "gen")
	@TableGenerator(initialValue = 101, name = "gen")
	private long id;
	@Column(unique = true)
	private String title;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date", nullable = false)
	private LocalDate endDate;
	private Integer quantity; // objects are nullable
	private double price; // primitives are not nullable
}
