package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;

import QuanLy.Entity.LichDay;
import QuanLy.enumPack.PhongHoc;
import QuanLy.enumPack.Time;

public class BangLichDay {
	
	static private List<LichDay> bangLichDay = new ArrayList<LichDay>();
	
	private BangLichDay(){
	}
	
	public List<LichDay> getInstance() {
		return bangLichDay;
	}
	
	static public boolean addBangLichDay(LichDay lichDay) {
		bangLichDay.add(lichDay);
		return true;
	}
	
	static public boolean isTrungLich(int time, int phong) {
		for (LichDay i : bangLichDay) {
			if(i.getTime() == Time.getTime(time) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichDay getLichDay(int id) {
		for(LichDay i : bangLichDay) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
