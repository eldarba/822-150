package core.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Coupon {

	private int id;
	private int companyId;
	private Category category;
	private String title;
	private String description;
	private LocalDate startDat;
	private LocalDate endDat;
	private int amount;
	private double price;
	private String image;

	public Coupon() {
	}

	public Coupon(int companyId, Category category, String title, String description, LocalDate startDat,
			LocalDate endDat, int amount, double price, String image) {
		super();
		this.companyId = companyId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.startDat = startDat;
		this.endDat = endDat;
		this.amount = amount;
		this.price = price;
		this.image = image;
	}

	public Coupon(int id, int companyId, Category category, String title, String description, LocalDate startDat,
			LocalDate endDat, int amount, double price, String image) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.startDat = startDat;
		this.endDat = endDat;
		this.amount = amount;
		this.price = price;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDat() {
		return startDat;
	}

	public void setStartDat(LocalDate startDat) {
		this.startDat = startDat;
	}

	public LocalDate getEndDat() {
		return endDat;
	}

	public void setEndDat(LocalDate endDat) {
		this.endDat = endDat;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", companyId=" + companyId + ", category=" + category + ", title=" + title
				+ ", description=" + description + ", startDat=" + startDat + ", endDat=" + endDat + ", amount="
				+ amount + ", price=" + price + ", image=" + image + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coupon other = (Coupon) obj;
		return id == other.id;
	}

}
