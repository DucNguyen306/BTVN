package Buoi6_Fruit.Main;

import Buoi6_Fruit.Entity.*;
import Buoi6_Fruit.Singelton.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.getInstance();
		Inventory.addFruit(new Tao("Táo 1", 50, 5, "A, B1, B2, C, D, K,...", 5));
		Inventory.addFruit(new Tao("Táo 2", 100, 10, "A, B2, B6, C, K,...", 10));
		Inventory.addFruit(new Chuoi("Chuối 1", 50, 5, "A, B1, C, D,...", 5));
		Inventory.addFruit(new Chuoi("Chuối 2", 100, 10, "A, B2, C, D, K,...", 10));
		Inventory.addFruit(new Cam("Cam 1", 50, 5, "A, C, D, K,...", 5));
		Inventory.addFruit(new Cam("Cam 2", 100, 10, "B1, D, K,...", 10));

		while (true) {
			System.out.println("Cửa hàng có các lựa chọn sau:");
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
				System.out.println("Cửa hàng có các lựa chọn sau:");
				System.out.println("1. Xem danh sách kho hàng");
				System.out.println("2. Thêm hàng vào Cart");
				System.out.println("Vui lòng nhập lựa chọn của bạn:");
				int tp = input.nextInt();
				if (tp == 1) {
					for (Fruit i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getName() + "    " + i.getPrice() + "    "
								+ i.getQuantity() + "    " + i.getVitamin());
					}
				}
				if(tp == 2) {
					Cart.getInstance();
					for (Fruit i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getName() + "    " + i.getPrice() + "    "
								+ i.getQuantity() + "    " + i.getVitamin());
					}
					while(true) {
						System.out.println("Mời bạn nhập id loại quả muốn mua:");
						int id = input.nextInt();
						System.out.println("Mời bạn nhập số lượng: ");
						int quantity = input.nextInt();
						if (Cart.addToCart(id, quantity)) {
							System.out.println("Thêm hàng vào Cart thành công!");
						}
						else {
							System.out.println("Không thể thêm hàng này vào Cart!");
						}
						System.out.println("Bạn muốn thêm loại quả nào nữa không?");
						temp = input.nextLine();
						if(temp.equals("Không")) {
							break;
						}
					}
				}
			}
		}
	}

}
