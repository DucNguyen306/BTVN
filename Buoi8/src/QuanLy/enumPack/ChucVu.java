package QuanLy.enumPack;

public enum ChucVu {
	GIANGVIEN(1), SINHVIEN(2), BAOVE(3), VESINH(4);

	public final int x;

	private ChucVu(int x) {
		this.x = x;
	}

	public static ChucVu getChucVu(int x) {
		for (ChucVu i : values()) {
			if (i.x == x) {
				return i;
			}
		}
		return null;
	}
}
