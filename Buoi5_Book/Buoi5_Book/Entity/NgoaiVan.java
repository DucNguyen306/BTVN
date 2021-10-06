package Buoi5_Book.Entity;

public class NgoaiVan extends Book{
	private String ISBN;

	public NgoaiVan(String author, double price, int quantity, String category, String ISBN) {
		super(author, price, quantity, category);
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}
