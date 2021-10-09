package Buoi6_Fruit.Entity;

public class Fruit {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String vitamin;
	static private int count;

	public Fruit(String name, double price, int quantity, String vitamin) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.vitamin = vitamin;
		this.id = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getId() {
		return id;
	}
	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}
}
