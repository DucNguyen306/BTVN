package Quan_Ly_Hoa_Qua;

public class Chuoi extends ThongTin{
	private float KL_Kali_40;
	
	public Chuoi(String Ten, int Gia, int SL, float KL_Kali_40) {
		super(Ten, Gia, SL);
		this.KL_Kali_40= KL_Kali_40;
	}
	
	public float getKL_Kali_40() {
		return KL_Kali_40;
	}
	
	@Override
	public String toString() {
		return getTen()+ ","+ getGia()+","+ getSL()+","+ getKL_Kali_40() + " Kali-40";
	}
}
