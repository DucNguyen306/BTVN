package QuanLy.Entity;

import 	QuanLy.enumPack.ChucVu;
import	QuanLy.enumPack.GioiTinh;

abstract public class Info {

	private int id;
	private int tuoi;
	private String ten;

	public Info(int id, int tuoi, String ten) {
		this.id = id;
		this.tuoi = tuoi;
		this.ten = ten;
	}
	abstract public GioiTinh getGioiTinh();
	abstract public ChucVu getChucVu();
	
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getId() {
		return id;
	}
}
