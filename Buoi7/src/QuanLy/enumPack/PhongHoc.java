package QuanLy.enumPack;

public enum PhongHoc {
	A101(1), B202(2), C303(3), D404(4);
	
	public final int x;
	
	private PhongHoc(int x) {
		this.x = x;
	}
	
	public static PhongHoc getPhongHoc(int x) {
		for(PhongHoc i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
