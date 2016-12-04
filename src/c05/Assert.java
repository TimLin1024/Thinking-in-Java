package c05;

public class Assert {
	private static void perr(String msg) {
		System.err.println(msg);
	}
	public final static void is_true(boolean exp) {
		if (!exp) {
			perr("Assertion failed");
		}
	}
	public final static void is_false(boolean exp) {
		if (exp) {
			perr("Assertion failed");
		}
	}
	
}
