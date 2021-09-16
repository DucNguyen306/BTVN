package DienTich_ChuVi;

import java.util.Scanner;

public class TamGiac extends KichThuoc{
	Scanner input = new Scanner(System.in);
	
	public void Xuat() {
		int a[] = new int[3];
		double DT, NCV;
		
		System.out.println("Nhập các cạnh: ");
		for(int i=0; i<3; i++) {
			size = input.nextInt();
			a[i]=size;
		}
		
		NCV =(a[0]+a[1]+a[2])/2;
		DT= Math.sqrt(NCV* (NCV-a[0])* (NCV-a[1]) * (NCV-a[2]));
		
		System.out.println("Chu vi: " + (a[0]+a[1]+a[2]) + "\n");
		System.out.println("Diện tích: " + DT);
	}
}
