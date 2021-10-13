package QuanLy.enumPack;

public enum Type_SV {
	CHINHQUY(1), LIENTHONG(2), TAICHUC(3);

	public final int x;

	private Type_SV(int x) {
		this.x = x;
	}

	public static Type_SV getType_SV(int x) {
		for (Type_SV i : values()) {
			if (i.x == x) {
				return i;
			}
		}
		return null;
	}
}
