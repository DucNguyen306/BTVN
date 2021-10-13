package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;

import QuanLy.Entity.SinhVien;

public class BangSinhVien {
	static private List<SinhVien> BangSinhVien = new ArrayList<SinhVien>();
	
	private BangSinhVien(){
	}
	
	public List<SinhVien> getInstance() {
		return BangSinhVien;
	}
	
	static public boolean addBangSinhVien(SinhVien sinhVien) {
		BangSinhVien.add(sinhVien);
		return true;
	}
	
	static public boolean isTrungSinhVien(int id) {
		for (SinhVien i : BangSinhVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
		static public SinhVien getSinhVien(int id) {
			for (SinhVien i : BangSinhVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}