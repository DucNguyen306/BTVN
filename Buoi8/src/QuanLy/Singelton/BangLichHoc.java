package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;

import QuanLy.Entity.LichHoc;
import QuanLy.enumPack.PhongHoc;
import QuanLy.enumPack.Time;

public class BangLichHoc {
	static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();
	
	private BangLichHoc(){
	}
	
	public List<LichHoc> getInstance() {
		return bangLichHoc;
	}
	
	static public boolean addBangLichHoc(LichHoc LichHoc) {
		bangLichHoc.add(LichHoc);
		return true;
	}
	
	static public boolean isTrungLich(int tg, int phong) {
		for (LichHoc i : bangLichHoc) {
			if(i.getTime() == Time.getTime(tg) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichHoc getLichHoc(int id) {
		for(LichHoc i : bangLichHoc) {
			if(i.getId() == id) return i;
		}
		return null;
	}

}
