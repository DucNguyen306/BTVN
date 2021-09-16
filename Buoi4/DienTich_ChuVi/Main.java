package DienTich_ChuVi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Nhập Hình muốn tính chu vi-diện tích: ");
		Scanner input = new Scanner(System.in);
		
		String hinh;
		hinh = input.nextLine();
		
		if (hinh.equals("Hình Chữ Nhật"))
		{
			HinhChuNhat hinh1 = new HinhChuNhat();
			hinh1.Xuat();
		}
		else if (hinh.equals("Hình Thoi"))
		{
			HinhThoi hinh2 = new HinhThoi();
			hinh2.Xuat();
		}
		else if (hinh.equals("Hình Vuông"))
		{
			HinhVuong hinh3 = new HinhVuong();
			hinh3.Xuat();
		}
		else if(hinh.equals("Hình Tam Giác"))
		{
			TamGiac hinh4 = new TamGiac();
			hinh4.Xuat();
		}
	}
}
