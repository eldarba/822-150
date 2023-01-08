package app.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "id" })
@ToString(exclude = { "entry" })
@Entity
public class Example {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String example;

	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Entry entry;

}
