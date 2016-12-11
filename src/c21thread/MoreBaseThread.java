package c21thread;

public class MoreBaseThread {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new ListOff()).start();
		}
		System.out.println("Waiting for listOff");
	}
}
