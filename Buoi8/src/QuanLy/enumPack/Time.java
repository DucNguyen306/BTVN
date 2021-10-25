package QuanLy.enumPack;

public enum Time {
	_7_7H45 (1), _8H_8H45 (2), _9H_9H45 (3), _10H_10H45 (4); 
	
	public final int tiet;
	
	private Time(int tiet) {
		this.tiet = tiet;
	}
	
	public static Time getTime(int tiet) {
		for(Time i : values()) {
			if(i.tiet == tiet) {
				return i;
			}
		}
		return null;
	}
}
