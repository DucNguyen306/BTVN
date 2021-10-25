package QuanLy.Main;

import java.util.Scanner;

import QuanLy.Singelton.*;
import QuanLy.Utils.*;

public class InLich {
	static public void InLichTruc() {
		System.out.print("Nhập id nhân sự trực: ");
		ID=UtilsProgram.readInt(input,"Nhập sai form int");
		BangLichTruc.getLichTruc(ID);
	}
	static public void OutputLichHoc() {
		System.out.print("Nhập id sinh viên: ");
		ID=UtilsProgram.readInt(input,"Nhập sai form int");
		BangLichHoc.getLichHoc(ID);
	}
	static public void OutputLichDay() {
		System.out.print("Nhập id giảng viên: ");
		ID=UtilsProgram.readInt(input,"Nhập sai form int");
		BangLichDay.getLichDay(ID);
	}
	static Scanner input=new Scanner(System.in);
	static int ID;
}