package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;
import QuanLy.Entity.GiangVien;

public class BangGiangVien {
	static private List<GiangVien> BangGiangVien = new ArrayList<GiangVien>();
	
	private BangGiangVien(){
	}
	
	public List<GiangVien> getInstance() {
		return BangGiangVien;
	}
	
	static public boolean addBangGiangVien(GiangVien giangVien) {
		BangGiangVien.add(giangVien);
		return true;
	}
	
	static public boolean isTrungGiangVien(int id) {
		for (GiangVien i : BangGiangVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}

		static public GiangVien getGiangVien(int id) {
			for (GiangVien i : BangGiangVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
