package Quan_Ly_Hoa_Qua;

public class ThongTin {
	private String Ten;
	private int Gia;
	private int SL;
	
	public ThongTin(String Ten, int Gia, int SL) {
		this.Ten=Ten;
		this.Gia=Gia;
		this.SL=SL;
	}
	public void setTen (String Ten) {
		this.Ten= Ten;
	}
	public String getTen () {
		return Ten;
	}
	public void setGia (int Gia) {
		this.Gia= Gia;
	}
	public int getGia() {
		return Gia;
	}
	public void setSl (int SL) {
		this.SL= SL;
	}
	public int getSL() {
		return SL;
	}
}
