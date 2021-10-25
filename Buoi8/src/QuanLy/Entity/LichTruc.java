package QuanLy.Entity;

import QuanLy.enumPack.Tang_VS;
import QuanLy.enumPack.Time;

public class LichTruc{
	private int id;
	private Time time;
	private Tang_VS tang;
	
	public LichTruc(int id, int time, int tang) {
		this.id = id;
		this.time = Time.getTime(time);
		this.tang = Tang_VS.getTang_VS(tang);
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return time;
	}
	
	public Tang_VS getTang() {
		return tang;
	}
}
