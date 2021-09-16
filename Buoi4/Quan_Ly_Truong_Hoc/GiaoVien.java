package Quan_Ly_Truong_Hoc;

import java.util.Scanner;

public class GiaoVien extends ThongTin{
	BoMon mon;
	public GiaoVien(String name, int age, String CCCD, BoMon mon){
		this.name= name;
		this.age= age;
		this.CCCD= CCCD;
		this.mon= mon;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String getCCCD() {
		return CCCD;
	}
	
	public BoMon getmon() {
		return mon;
	}
}
