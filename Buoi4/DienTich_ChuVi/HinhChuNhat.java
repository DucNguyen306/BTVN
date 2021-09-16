package DienTich_ChuVi;

import java.util.Scanner;

public class HinhChuNhat extends KichThuoc{
	Scanner input = new Scanner(System.in);
	
	public void Xuat() {
		System.out.println("Nhập độ dài cạnh: ");
		int a[] = new int[2];
		
		for(int i=0; i<2; i++) {
			size = input.nextInt();
			a[i]=size;
		}
		
		System.out.println("Chu vi: " + 2*(a[0]+a[1]) + '\n');
		System.out.println("Diện tích: " + a[0]*a[1]);
	}
}
