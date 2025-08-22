package ch06;

public class CurrencyCbt {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double tokwr(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate=r;
		
	}
}
