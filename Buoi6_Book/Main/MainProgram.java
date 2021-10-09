package Buoi6_Book.Main;

import java.util.List;
import java.util.Scanner;

import Buoi6_Book.Entity.*;
import Buoi6_Book.Singelton.*;
import Buoi6_Book.Singelton.Inventory;

public class MainProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.getInstance();
		Inventory.addBook(new VanHoc("Hoàng Thanh T", 50, 5, "Văn Xuôi", 5));
		Inventory.addBook(new VanHoc("Nguyễn Văn A", 100, 10, "Thơ", 10));
		Inventory.addBook(new KhoaHoc("Lê Thị B", 150, 15, "Toán", 2015));
		Inventory.addBook(new KhoaHoc("Lê Xuân C", 200, 20, "Lý", 2020));
		Inventory.addBook(new NgoaiVan("Đỗ Thị D", 150, 15, "Tiểu thuyết", "123456789"));
		Inventory.addBook(new NgoaiVan("Bùi Thị E", 100, 10, "Tự Truyện", "987654321"));

		while (true) {
			System.out.println("Hiệu sách có các lựa chọn sau:");
			System.out.println("1. Quản lí kho");
			System.out.println("2. Khách hàng");
			System.out.println("Vui lòng nhập lựa chọn của bạn:");
			String temp = input.nextLine();
			if (temp.equals("Quản lí kho")) {
				while (true) {
					System.out.println("Mời bạn nhập id loại quả muốn thêm vào: ");
					int id = input.nextInt();
					System.out.println("Mời bạn nhập số lượng");
					int quantity = input.nextInt();
					Inventory.addQuantity(id, quantity);
					System.out.println("Bạn có muốn thêm loại quả không?");
					temp = input.nextLine();
					if (temp.equals("Không")) {
						break;
					}
				}
			} else {
				System.out.println("Hiệu sách có các lựa chọn sau:");
				System.out.println("1. Xem danh sách kho hàng");
				System.out.println("2. Thêm hàng vào Cart");
				System.out.println("Vui lòng nhập lựa chọn của bạn:");
				int tp = input.nextInt();
				if (tp == 1) {
					for (Book i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getAuthor() + "    " + i.getPrice() + "    " + "    "
								+ i.getQuantity() + "    " + i.getCategory());
					}
				} else if (tp == 2) {
					Cart.getInstance();
					for (Book i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getAuthor() + "    " + i.getPrice() + "    " + "    "
								+ i.getQuantity() + "    " + i.getCategory());
					}
					while (true) {
						System.out.println("Mời bạn nhập id sách muốn mua");
						int id = input.nextInt();
						System.out.println("Mời bạn nhập số lượng");
						int quantity = input.nextInt();
						if (Cart.addToCart(id, quantity)) {
							System.out.println("Thêm hàng vào Cart thành công!");
						} else {
							System.out.println("Không thể thêm hàng này vào Cart!");
						}
						System.out.println("Bạn muốn thêm loại sách nào nữa không?");
						temp = input.nextLine();
						if (temp.equals("Không")) {
							break;
						}
					}
				} else System.out.println("Tổng Tiền: " + Cart.intoMoney());
			}
		}
	}
}
