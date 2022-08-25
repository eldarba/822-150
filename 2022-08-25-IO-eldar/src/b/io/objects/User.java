package b.io.objects;

import java.io.Serializable;

public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String fullName;
	private String userName;
	private transient String password; // transient fields are not serialized - will get default values
	private String email;
	private transient long creditCard; // transient fields are not serialized - will get default values

	public User() {
	}

	public User(int id, String fullName, String userName, String password, String email, long creditCard) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.creditCard = creditCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(long creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", creditCard=" + creditCard + "]";
	}

}
