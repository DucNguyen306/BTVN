package QuanLy.enumPack;

public enum Tang_VS {
	TANG1(1), TANG2(2), TANG3(3), TANG4(4);
	
	private final int x;
	
	private Tang_VS(int x) {
		this.x = x;
	}
	
	public static Tang_VS getTang_VS(int x) {
		for(Tang_VS i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
