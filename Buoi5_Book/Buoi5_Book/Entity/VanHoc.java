package Buoi5_Book.Entity;

public class VanHoc extends Book{
	private int TaiBan;

	public VanHoc(String author, double price, int quantity, String category, int TaiBan) {
		super(author, price, quantity, category);
		this.TaiBan = TaiBan;
	}

	public int getTaiBan() {
		return TaiBan;
	}

	public void setTaiBan(int taiBan) {
		TaiBan = taiBan;
	}
}
