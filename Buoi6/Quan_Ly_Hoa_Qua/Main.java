package Quan_Ly_Hoa_Qua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Tao> list_Tao= new ArrayList<Tao>();
		list_Tao.add(new Tao("Táo Loại 1", 5000, 5, 20));
		list_Tao.add(new Tao("Táo Loại 2", 10000, 10, 30));
		list_Tao.add(new Tao("Táo Loại 3", 15000, 15, 40));
		
		ArrayList<Cam> list_Cam= new ArrayList<Cam>();
		list_Cam.add(new Cam("Cam loại 1", 5000, 5, 200));
		list_Cam.add(new Cam("Cam loại 2", 10000, 10, 300));
		list_Cam.add(new Cam("Cam loại 3", 15000, 15, 400));
		
		ArrayList<Chuoi> list_Chuoi= new ArrayList<Chuoi>();
		list_Chuoi.add(new Chuoi("Chuối loại 1", 5000, 5, 200));
		list_Chuoi.add(new Chuoi("Chuối loại 2", 10000, 10, 300));
		list_Chuoi.add(new Chuoi("Chuối loại 2", 15000, 15, 400));
		
		System.out.println("1. Xem thông tin hoa quả \n2. Mua hàng");
		System.out.println("Mời nhập yêu cầu!");
		int YC;
		YC= input.nextInt();
		
		if (YC==1) {
			System.out.println("Thong tin về táo:");
			for (int i=0; i<3; i++) {
				System.out.println(list_Tao.get(i).toString());
			}
			
			for (int i=0; i<3; i++) {
				System.out.println(list_Cam.get(i).toString());
			}

			for (int i=0; i<3; i++) {
				System.out.println(list_Chuoi.get(i).toString());
			}
		}
		
		else {
			System.out.println("Số tiền: ");
			int Tien;
			Tien= input.nextInt();
			System.out.println("Bạn có thể mua nhiều nhất mỗi loại là:");
			
			for (int i=0; i<3; i++) {
				int sl= Tien/list_Tao.get(i).getGia();
				if (sl<=list_Tao.get(i).getSL()) {
					System.out.println(list_Tao.get(i).getTen()+": "+sl);
				}
				else System.out.println(list_Tao.get(i).getTen()+": "+list_Tao.get(i).getSL());
			}
			
			for (int i=0; i<3; i++) {
				int sl= Tien/list_Cam.get(i).getGia();
				if (sl<=list_Cam.get(i).getSL()) {
					System.out.println(list_Cam.get(i).getTen()+": "+sl);
				}
				else System.out.println(list_Cam.get(i).getTen()+": "+list_Cam.get(i).getSL());
			}
			
			for (int i=0; i<3; i++) {
				int sl= Tien/list_Chuoi.get(i).getGia();
				if (sl<=list_Chuoi.get(i).getSL()) {
					System.out.println(list_Chuoi.get(i).getTen()+": "+sl);
				}
				else System.out.println(list_Chuoi.get(i).getTen()+": "+list_Chuoi.get(i).getSL());
			}
		}
	}
}
