package QuanLy.Main;

import java.util.Scanner;
public class MainProgram {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(input.nextLine());
			switch(choose) {
			case 1:
				NhapMember.input();
				break;
			case 2:
				NhapLich.NhapLichTruc();
				break;
			case 3:
				NhapLich.NhapLichHoc();
				break;
			case 4:
				NhapLich.NhapLichDay();
				break;
			case 5:
				NhapLich.NhapLichHoc();
				break;
			case 6:
				NhapLich.NhapLichDay();
				break;
			case 7:
				NhapLich.NhapLichTruc();
				break;
			case 8:
				System.out.println("Thoát");
				break;
				default:
					System.out.println("Nhập lại");
			}
		} while(choose!=8);
	}
	static public void showMenu() {
		System.out.println("1.Nhập danh sách nhân sự");
		System.out.println("2.Nhập bảng lịch trực");
		System.out.println("3.Nhập bảng lịch học");
		System.out.println("4.Nhập bảng lịch dạy");
		System.out.println("5.In ra lịch học");
		System.out.println("6.In ra lịch dạy");
		System.out.println("7.In ra lịch trực");
		System.out.println("8.Thoát");
		System.out.print("Chọn: ");
	}
}