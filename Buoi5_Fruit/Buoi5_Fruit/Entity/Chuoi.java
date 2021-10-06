package Buoi5_Fruit.Entity;

public class Chuoi extends Fruit{
	private double kali;

	public Chuoi(String name, double price, int quantity, String vitamin, double kali) {
		super(name, price, quantity,vitamin);
		this.kali = kali;
	}

	public double getKali() {
		return kali;
	}

	public void setKali(double kali) {
		this.kali = kali;
	}
}
