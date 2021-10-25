package QuanLy.Entity;

import QuanLy.enumPack.PhongHoc;
import QuanLy.enumPack.Time;

public class LichDay{
	private int id;
	private Time time;
	private PhongHoc phong;
	
	public LichDay(int id, int time, int phong) {
		this.id = id;
		this.time = Time.getTime(time);
		this.phong = PhongHoc.getPhongHoc(phong);
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return time;
	}
	
	public PhongHoc getPhongHoc() {
		return phong;
	}
	
}
