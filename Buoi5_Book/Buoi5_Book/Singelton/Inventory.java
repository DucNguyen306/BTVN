package Buoi5_Book.Singelton;

import java.util.ArrayList;
import java.util.List;

import Buoi5_Book.Entity.Book;

public class Inventory {
	static public List<Book> inventory;

	private Inventory() {
	}

	static public List<Book> getInstance() {
		if (inventory == null) {
			inventory = new ArrayList<Book>();
			return inventory;
		}
		return inventory;
	}

	static public boolean addBook(Book book) {
		inventory.add(book);
		return true;
	}

	static public boolean isValid(int id) {
		for (Book i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public Book getBook(int id) {
		return inventory.get(id - 1);
	}

	static public boolean addQuantity(int id, int quantity) {
		if (isValid(id)) {
			Book temp = getBook(id);
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity + quantity);
			return true;
		}
		return false;
	}

}
