package QuanLy.Entity;

import QuanLy.enumPack.ChucVu;
import QuanLy.enumPack.GioiTinh;
import QuanLy.enumPack.Type_SV;

public class SinhVien extends Info{
	private GioiTinh gioiTinh;
	private ChucVu chucVu;
	private Type_SV type;
	
	public SinhVien(int id, int tuoi, String ten, int gioiTinh, int chucVu, int type) {
		super(id, tuoi, ten);
		this.gioiTinh = GioiTinh.getGioiTinh(gioiTinh);
		this.chucVu = ChucVu.getChucVu(chucVu);
		this.type = Type_SV.getType_SV(type);
	}
	
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	
	public ChucVu getChucVu() {
		return chucVu;
	}
	
	public Type_SV getType_SV() {
		return type;
	}
}
