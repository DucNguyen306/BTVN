package QuanLy.Main;

import java.util.Scanner;

import QuanLy.Entity.*;
import QuanLy.Singelton.*;
import QuanLy.Utils.*;

public class NhapMember {
	static public void input() {
		DanhSachDoiTuong();
		int doiTuong=UtilsProgram.readInt(input, "Nhập sai form int", 1, 4);
		switch(doiTuong) {
		case 1:
			System.out.println("Nhập số lượng sinh viên muốn thêm: ");
			soLuong=UtilsProgram.readInt(input,"Nhập sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhập id: ");
				int id=UtilsProgram.readInt(input,"Nhập sai form String");
				System.out.print("Nhập tên: ");
				String ten=UtilsProgram.readStr(input,"Nhập sai form String");
				System.out.print("Nhập tuổi: ");
				int tuoi=UtilsProgram.readInt(input, "Nhập sai form int", 18, 35);
				System.out.println("Nhập giới tính: ");
				GT();
				int gioiTinh=UtilsProgram.readInt(input, "Nhập sai form int", 1, 3);
				System.out.println("Nhập loại sinh viên");
				int cv=UtilsProgram.readInt(input, "Nhập sai form int", 1, 3);
				System.out.println("Nhập chức vụ");
				sType();
				int type=UtilsProgram.readInt(input, "Nhập sai form int", 1, 3);
				BangSinhVien.addBangSinhVien(new SinhVien(id,tuoi,ten,gioiTinh,cv,type));
			}
			break;
		case 2:
			System.out.println("Nhập số lượng nhân sự muốn thêm: ");
			soLuong=UtilsProgram.readInt(input,"Nhập sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhập id: ");
				int id =UtilsProgram.readInt(input,"Nhập sai form String");
				System.out.print("Nhập tên: ");
				String ten=UtilsProgram.readStr(input,"Nhập sai form String");
				System.out.print("Nhập tuổi: ");
				int tuoi=UtilsProgram.readInt(input, "Nhập sai form int", 25, 60);
				System.out.println("Nhập giới tính");
				GT();
				int gioiTinh=UtilsProgram.readInt(input, "Nhập sai form int", 1, 3);
				System.out.println("Nhập chức vụ");
				sType();
				int cv=UtilsProgram.readInt(input, "Nhap sai form int", 1, 3);
				BangNhanVien.addBangNhanVien(new NhanVien(id,tuoi,ten,gioiTinh,cv));
			}
			break;
		}
	}
	static Scanner input=new Scanner(System.in);
	static int soLuong;
	static public void DanhSachDoiTuong() {
		System.out.println("1.Giảng Viên");
		System.out.println("2.Sinh Viên");
		System.out.println("2.Bảo Vệ");
		System.out.println("2.Nhân Viên Vệ Sinh");
		System.out.print("Chon: ");
	}
	static public void GT() {
		System.out.println("0.Nữ");
		System.out.println("1.Nam");
		System.out.println("2.Khác");
		System.out.print("Chọn: ");
	}
	static public void sType() {
		System.out.println("1.Chính quy");
		System.out.println("2.Liên thông");
		System.out.println("3.Tại chức");
		System.out.print("Chọn: ");
	}
}