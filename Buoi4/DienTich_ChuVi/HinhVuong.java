package DienTich_ChuVi;

import java.util.Scanner;

public class HinhVuong extends KichThuoc{
	Scanner input = new Scanner(System.in);
	
	public void Xuat() {
		System.out.println("Nhập độ dài cạnh: ");
		size = input.nextInt();
		
		System.out.println("Chu vi: " + size*4 + "\n");
		System.out.println("Diện tích: " + size*size);
	}
}