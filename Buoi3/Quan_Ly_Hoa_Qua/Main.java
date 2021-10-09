package Quan_Ly_Hoa_Qua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<ThongTin> list_ThongTin= new ArrayList<ThongTin>();
		list_ThongTin.add(new Tao("Táo Loại 1", 5000, 5, 20));
		list_ThongTin.add(new Tao("Táo Loại 2", 10000, 10, 30));
		list_ThongTin.add(new Tao("Táo Loại 3", 15000, 15, 40));
		list_ThongTin.add(new Cam("Cam loại 1", 5000, 5, 200));
		list_ThongTin.add(new Cam("Cam loại 2", 10000, 10, 300));
		list_ThongTin.add(new Cam("Cam loại 3", 15000, 15, 400));
		list_ThongTin.add(new Chuoi("Chuối loại 1", 5000, 5, 200));
		list_ThongTin.add(new Chuoi("Chuối loại 2", 10000, 10, 300));
		list_ThongTin.add(new Chuoi("Chuối loại 2", 15000, 15, 400));
		
		System.out.println("1. Xem thông tin hoa quả \n2. Mua hàng");
		System.out.println("Mời nhập yêu cầu!");
		int YC;
		YC= input.nextInt();
		
		if (YC==1) {
			System.out.println("Thong tin về táo:");
			for (int i=0; i<9; i++) {
				System.out.println("Ten qua: " + list_ThongTin.get(i).getTen() + "\n" + "Gia: " + list_ThongTin.get(i).getGia() + "\n" + "So Luong: " + list_ThongTin.get(i).getSL());
				if(list_ThongTin.get(i) instanceof Tao) {
					Tao temp = (Tao) list_ThongTin.get(i);
					System.out.println("Luong duong: " + temp.getLD() + " Kalo");
				}
				else if(list_ThongTin.get(i) instanceof Cam) {
					Cam temp = (Cam) list_ThongTin.get(i);
					System.out.println("Can nang: " + temp.getCN() + " gam");
				}
				else {
					Chuoi temp = (Chuoi) list_ThongTin.get(i);
					System.out.println("Khoi luong dong vi: " + temp.getKL_Kali_40());
				}
			}
		}
		
		else {
			System.out.println("Số tiền: ");
			int Tien;
			Tien= input.nextInt();
			
			for(int i=0; i<9; i++) {
				System.out.print("Mua được tối đa: ");
				int temp = (int)Math.min(Tien/(list_ThongTin.get(i).getGia()), list_ThongTin.get(i).getSL());
				System.out.println(temp + " " + list_ThongTin.get(i).getTen());
			}
		}
	}
}
