package interviewQuestions2;

public class Shop {
	String name;
	String city;
	String day;
	String product;
	int price;
	String paymentType;

	public Shop(String name, String city, String day, String product, int price, String paymentType) {
		super();
		this.name = name;
		this.city = city;
		this.day = day;
		this.product = product;
		this.price = price;
		this.paymentType = paymentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", city=" + city + ", price=" + price + "]";
	}

}