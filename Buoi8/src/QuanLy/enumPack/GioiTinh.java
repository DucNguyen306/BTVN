package QuanLy.enumPack;

public enum GioiTinh {
	NU(0), NAM(1), KHAC(2);

	public final int x;
	private GioiTinh(int x) {
		this.x = x;
	}
	
	public static GioiTinh getGioiTinh(int x) {
		for(GioiTinh i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
