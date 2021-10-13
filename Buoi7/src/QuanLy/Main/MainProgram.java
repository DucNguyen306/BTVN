package QuanLy.Main;

import java.util.Scanner;

import QuanLy.Entity.*;
import QuanLy.enumPack.*;
import QuanLy.Singelton.*;

public class MainProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true) {
			
			System.out.println("1. Thêm vào Thông Tin:");
			System.out.println("2. Nhập ID cần lấy thông tin:");
			int dem;
			dem = input.nextInt();
			
			if(dem == 1) {
				System.out.println("Nhập ID: ");
				int id; 
				id = input.nextInt();
				System.out.println("Nhập Tên: ");
				input.nextLine();
				String ten; 
				ten = input.nextLine();
				System.out.println("Nhập Tuổi: ");
				int tuoi; 
				tuoi = input.nextInt();
				System.out.println("NỮ: 0" + "\n" + "NAM: 1" + "\n" + "KHÁC: 2");
				System.out.println("Nhập giới tính:");
				int gioiTinh; 
				gioiTinh = input.nextInt();
				System.out.println("GIẢNG VIÊN: 1" + "\n" + "SINH VIÊN: 2" + "\n" + "BẢO VỆ: 3" + "\n" + "VỆ SINH: 4");
				System.out.println("Nhập chức vụ:");
				int chucVu; 
				chucVu = input.nextInt();
				
				if(ChucVu.getChucVu(chucVu) == ChucVu.GIANGVIEN) {
					
					if(BangGiangVien.isTrungGiangVien(id) == false) {
						BangGiangVien.addBangGiangVien(new GiangVien(id, tuoi, ten, gioiTinh, chucVu));
					}
					System.out.println("_7_7H45: 1" + "\n" + "_8H_8H45: 2" + "\n" + "_9H_9H45: 3" + "\n" + "_10H_10H45: 4");
					System.out.println("Nhập thời gian thêm lịch dạy");
					int time; 
					time = input.nextInt();
					System.out.println("A101: 1" + "\n" + "B202: 2" + "\n" +"C303: 3" +"\n" + "D404: 4");
					System.out.println("Nhập phòng học: ");
					int phong;
					phong = input.nextInt();
			
					if(BangLichDay.isTrungLich(time, phong) == false) {
						BangLichDay.addBangLichDay(new LichDay(id, time, phong));
					}
				}
				else if(ChucVu.getChucVu(chucVu) == ChucVu.SINHVIEN) {
					System.out.println("CHINHQUY: 1" + "\n" + "LIENTHONG: 2" + "\n" +"TAICHUC: 3");
					System.out.println("Nhập loại Sinh Viên:");
					int Type;
					Type = input.nextInt();
					
					if(BangSinhVien.isTrungSinhVien(id) == false) {
						BangSinhVien.addBangSinhVien(new SinhVien(id, tuoi, ten, gioiTinh, chucVu, Type));
					}

					System.out.println("_7_7H45: 1" + "\n" + "_8H_8H45: 2" + "\n" + "_9H_9H45: 3" + "\n" + "_10H_10H45: 4");
					System.out.println("Nhập thời gian học thêm");
					int time; 
					time = input.nextInt();
					System.out.println("A101: 1" + "\n" + "B202: 2" + "\n" +"C303: 3" +"\n" + "D404: 4");
					System.out.println("Nhập phòng học: ");
					int phong;
					phong = input.nextInt();
					
					if(BangLichHoc.isTrungLich(time, phong) == false) {
						BangLichHoc.addBangLichHoc(new LichHoc(id, time, phong));
					}
				}
				else{
					if(BangNhanVien.isTrungNhanVien(id) == false) {
						BangNhanVien.addBangNhanVien(new NhanVien(id, tuoi, ten, gioiTinh, chucVu));
					}
					
					System.out.println("_7_7H45: 1" + "\n" + "_8H_8H45: 2" + "\n" + "_9H_9H45: 3" + "\n" + "_10H_10H45: 4");
					System.out.println("Nhập thời gian thêm lịch trực");
					int time; 
					time = input.nextInt();
					System.out.println("TANG1: 1" + "\n" + "TANG2: 2" +"\n" + "TANG3: 3" + "\n" + "TANG4: 4");
					System.out.println("Nhập tầng trực thêm");
					int tang;
					tang = input.nextInt();
			
					if(BangLichTruc.isTrungLich(time, tang) == false) {
						BangLichTruc.addBangLichTruc(new LichTruc(id, time, tang));
					}
				}
			}
			else if (dem == 2){
				System.out.println("Nhập ID: ");
				int id; 
				id = input.nextInt();
				
				System.out.println("Thông tin nhân sự và công việc");
				if(BangGiangVien.getGiangVien(id) != null) {
					System.out.println(BangGiangVien.getGiangVien(id).getId());
					System.out.println(BangGiangVien.getGiangVien(id).getTen());
					System.out.println(BangGiangVien.getGiangVien(id).getTuoi());
					System.out.println(BangGiangVien.getGiangVien(id).getGioiTinh());
					System.out.println(BangGiangVien.getGiangVien(id).getChucVu());	
					
					if(BangLichDay.getLichDay(id) !=null) {
						System.out.println(BangLichDay.getLichDay(id).getPhongHoc());
						System.out.println(BangLichDay.getLichDay(id).getTime());
					}
					else {
						System.out.println("Không có thông tin!");
					}
				}
				else if(BangNhanVien.getNhanVien(id) != null) {
					System.out.println(BangNhanVien.getNhanVien(id).getId());
					System.out.println(BangNhanVien.getNhanVien(id).getTen());
					System.out.println(BangNhanVien.getNhanVien(id).getTuoi());
					System.out.println(BangNhanVien.getNhanVien(id).getGioiTinh());
					System.out.println(BangNhanVien.getNhanVien(id).getChucVu());
					
					if(BangLichTruc.getLichTruc(id) !=null) {
						System.out.println(BangLichTruc.getLichTruc(id).getTang());
						System.out.println(BangLichTruc.getLichTruc(id).getTime());
					}
					else {
						System.out.println("Không có Thông tin!");
					}
				}
				else if(BangSinhVien.getSinhVien(id) != null){
					System.out.println(BangSinhVien.getSinhVien(id).getId());
					System.out.println(BangSinhVien.getSinhVien(id).getTen());
					System.out.println(BangSinhVien.getSinhVien(id).getTuoi());
					System.out.println(BangSinhVien.getSinhVien(id).getGioiTinh());
					System.out.println(BangSinhVien.getSinhVien(id).getChucVu());
	
					if(BangLichHoc.getLichHoc(id) !=null) {
						System.out.println(BangLichHoc.getLichHoc(id).getPhongHoc());
						System.out.println(BangLichHoc.getLichHoc(id).getTime());
					}
					else {
						System.out.println("Không có thông tin!");
					}
				}
				else {
					System.out.println("Nhập sai ID!");
				}
			}
			else break;
		}
	}
}