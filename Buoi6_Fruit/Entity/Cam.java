package Buoi6_Fruit.Entity;


public class Cam extends Fruit{
	private double Kali;

	public Cam(String name, double price, int quantity, String vitamin, double weight) {
		super(name, price, quantity,vitamin);
		this.Kali = Kali;
	}

	public double getKali() {
		return Kali;
	}

	public void setKali(double Kali) {
		this.Kali = Kali;
	}
}
