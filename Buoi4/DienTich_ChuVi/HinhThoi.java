package DienTich_ChuVi;

import java.util.Scanner;

public class HinhThoi extends KichThuoc{
	Scanner input = new Scanner(System.in);
	
	public void Xuat() {
		System.out.println("Nhập độ dài 2 đường chéo: ");
		int a[] = new int[2];
		
		for(int i=0; i<2; i++) {
			size = input.nextInt();
			a[i]=size;
		}
		
		double canh;
		canh = Math.sqrt(a[0]*a[0]+a[1]*a[1])/2;
		
		System.out.println("Chu vi: " + 4*canh + "\n");
		System.out.println("Diện tích: " + a[0]*a[1]/2);
	}
}
