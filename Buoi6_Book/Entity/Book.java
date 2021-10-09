package Buoi6_Book.Entity;

public class Book {
	private int id;
	private String author;
	private double price;
	private int quantity;
	private String category;
	static public int count;

	public Book(String author, double price, int quantity, String category) {
		super();
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.id = ++count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
