package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;
import QuanLy.Entity.NhanVien;

public class BangNhanVien {
	static private List<NhanVien> BangNhanVien = new ArrayList<NhanVien>();
	
	private BangNhanVien(){
	}
	
	public List<NhanVien> getInstance() {
		return BangNhanVien;
	}
	
	static public boolean addBangNhanVien(NhanVien nhanVien) {
		BangNhanVien.add(nhanVien);
		return true;
	}

	static public boolean isTrungNhanVien(int id) {
		for (NhanVien i : BangNhanVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static public NhanVien getNhanVien(int id) {
		for (NhanVien i : BangNhanVien) {
			if(i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}