package QuanLy.Main;

import java.util.Scanner;

import QuanLy.Entity.*;
import QuanLy.Singelton.*;
import QuanLy.Utils.*;

public class NhapLich {
	static public void NhapLichTruc() {
		System.out.println("Nhập số lượng nhân sự trực: ");
		soLuong=UtilsProgram.readInt(in, "Nhập sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhập id nhân sự muốn thêm: ");
			ID=UtilsProgram.readInt(in,"Nhập sai form int");
			System.out.println("Nhập thời gian trực");
			khungThoiGian();
			time=UtilsProgram.readInt(in, "Nhập sai form int", 1, 7);
			System.out.println("Nhập địa điểm trực");
			danhSachDiaDiem();
			diaDiem=UtilsProgram.readInt(in, "Nhập sai form int", 1, 5);
			BangLichTruc.addBangLichTruc(new LichTruc(ID,time,diaDiem));
		}
	}
	static public void NhapLichHoc() {
		System.out.println("Nhập số lượng sinh viên: ");
		soLuong=UtilsProgram.readInt(in, "Nhập sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhập id sinh viên muốn thêm: ");
			ID=UtilsProgram.readInt(in,"Nhập sai form int");
			System.out.println("Nhập thời gian học");
			khungThoiGian();
			time=UtilsProgram.readInt(in, "Nhập sai form int", 1, 7);
			System.out.println("Nhập phòng học");
			danhSachPhongHoc();
			phong=UtilsProgram.readInt(in, "Nhập sai form int", 1, 3);
			BangLichHoc.addBangLichHoc(new LichHoc(ID,time,phong));
		}
	}
	static public void NhapLichDay() {
		System.out.println("Nhập số lượng giảng viên: ");
		soLuong=UtilsProgram.readInt(in, "Nhập sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhập id giảng viên muốn thêm: ");
			ID=UtilsProgram.readInt(in,"Nhập sai form int");
			System.out.println("Nhập thời gian dạy");
			khungThoiGian();
			time=UtilsProgram.readInt(in, "Nhập sai form int", 1, 7);
			System.out.println("Nhập phòng học");
			danhSachPhongHoc();
			phong=UtilsProgram.readInt(in, "Nhập sai form int", 1, 3);
			BangLichHoc.addBangLichHoc(new LichHoc(ID,time,phong));
		}
	}
	static Scanner in=new Scanner(System.in);
	static int phong;
	static int time;
	static int diaDiem;
	static int soLuong;
	static int ID;
	static public void khungThoiGian() {
		System.out.println("1.Tiết 1");
		System.out.println("2.Tiết 2");
		System.out.println("3.Tiết 3");
		System.out.println("4.Tiết 4");
		System.out.println("5.Tiết 5");
		System.out.println("6.Tiết 6");
		System.out.println("7.Tiết 7");
		System.out.print("Chon: ");
	}
	static public void danhSachDiaDiem() {
		System.out.println("1.Tang 1");
		System.out.println("2.Tang 2");
		System.out.println("3.Tang 3");
		System.out.println("4.Tang 4");
		System.out.print("Chon: ");
	}
	static public void danhSachPhongHoc() {
		System.out.println("1.A101");
		System.out.println("2.B202");
		System.out.println("3.C303");
		System.out.println("4.D404");
		System.out.print("Chon: ");
	}
}