package Quan_Ly_Hoa_Qua;

public class Tao extends ThongTin{
	private float LD;
	public Tao(String Ten, int Gia, int Sl, float Duong) {
		super(Ten, Gia, Sl);
		this.LD=LD;
	}
	
	public float getLD () {
		return LD;
	}
}
