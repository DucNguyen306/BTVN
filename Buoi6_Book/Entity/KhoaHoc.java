package Buoi6_Book.Entity;

public class KhoaHoc extends Book{
	private int year;
	
	public KhoaHoc(String author, double price, int quantity, String category, int year) {
		super(author, price, quantity, category);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}