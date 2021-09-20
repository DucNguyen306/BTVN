package Quan_Ly_Hoa_Qua;

public class Cam extends ThongTin{
	private String cannang;
	private float CN;
	public Cam(String Ten, int Gia, int SL, float CN) {
		super(Ten, Gia, SL);
		this.CN= CN;
	}

	public float getCN() {
		return CN;
	}

	@Override
	public String toString() {
		return getTen()+ ","+ getGia()+","+ getSL()+","+ getCN()+ " gam";
	}
}
