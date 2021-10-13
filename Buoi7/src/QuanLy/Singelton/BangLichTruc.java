package QuanLy.Singelton;

import java.util.ArrayList;
import java.util.List;

import QuanLy.Entity.LichTruc;
import QuanLy.enumPack.Tang_VS;
import QuanLy.enumPack.Time;

public class BangLichTruc {
	
	static private List<LichTruc> bangLichTruc = new ArrayList<LichTruc>();
	
	private BangLichTruc(){
	}
	
	public List<LichTruc> getInstance() {
		return bangLichTruc;
	}

	static public boolean addBangLichTruc(LichTruc lichTruc) {
		bangLichTruc.add(lichTruc);
		return true;
	}

	static public boolean isTrungLich(int time, int tang) {
		for (LichTruc i : bangLichTruc) {
			if(i.getTime() == Time.getTime(time) && i.getTang() == Tang_VS.getTang_VS(tang)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichTruc getLichTruc(int id) {
		for(LichTruc i : bangLichTruc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
