package Quan_Ly_Truong_Hoc;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<BoMon> list_Mon = new ArrayList<BoMon>();
		list_Mon.add(new BoMon("Văn")); 
		list_Mon.add(new BoMon("Sử")); 
		list_Mon.add(new BoMon("Địa")); 
		
		ArrayList<GiaoVien> list_GV = new ArrayList<GiaoVien>();
		list_GV.add(new GiaoVien("Nguyễn Quết A", 34, "02990043", list_Mon.get(0)));
		list_GV.add(new GiaoVien("Trần Đức B", 48, "02984743", list_Mon.get(2)));
		list_GV.add(new GiaoVien("Hoàng Thanh C", 30, "04628384", list_Mon.get(2)));
		list_GV.add(new GiaoVien("Lê Thị D", 39, "03747855", list_Mon.get(1)));
		list_GV.add(new GiaoVien("Lê Văn E", 31, "08647585", list_Mon.get(0)));
		
		ArrayList<NhanVienBaoVe> list_BV = new ArrayList<NhanVienBaoVe>();
		list_BV.add(new NhanVienBaoVe("Trần Trọng A", 50, "02374849"));
		list_BV.add(new NhanVienBaoVe("Hoàng Thị B", 54, "08849497"));
		list_BV.add(new NhanVienBaoVe("Đỗ Văn C", 43, "08833839"));
		list_BV.add(new NhanVienBaoVe("Trần Thị D", 65, "07364747"));
		list_BV.add(new NhanVienBaoVe("Phạm Văn E", 30, "07474889"));
		
		ArrayList<NhanVienVeSinh> list_VS = new ArrayList<NhanVienVeSinh>();
		list_VS.add(new NhanVienVeSinh("Dương Văn A",38 , "0374747"));
		list_VS.add(new NhanVienVeSinh("Đỗ Thế B",38 , "0383745"));
		list_VS.add(new NhanVienVeSinh("Trần Văn C",38 , "0273764"));
		list_VS.add(new NhanVienVeSinh("Phạm Ngọc D",38 , "0548889"));
		list_VS.add(new NhanVienVeSinh("Lê thị E",38 , "0478856"));
		
		ArrayList<Hocsinh> list_HS = new ArrayList<Hocsinh>();
		list_HS.add(new Hocsinh("Nguyễn Văn A", 19, "0737748"));
		list_HS.add(new Hocsinh("Hoàng Thanh B", 19, "0484889"));
		list_HS.add(new Hocsinh("Lê Thị Thanh C", 19, "0937475"));
		list_HS.add(new Hocsinh("Đỗ Trúc D", 19, "0948485"));
		list_HS.add(new Hocsinh("Lê Văn E", 19, "0774885"));
		
		System.out.println("Danh sách giáo viên:");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD(), list_GV.get(i).getmon().mon);
		}
		System.out.println("\n");
		
		System.out.println("Danh sách nhân viên bảo vệ: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
		System.out.println("\n");
		
		System.out.println("Danh sách nhân viên vệ sinh: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
		System.out.println("\n");
		
		System.out.println("Danh sách học sinh: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
	}
}
