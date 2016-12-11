package c21thread;

public class Pratice1 implements Runnable{
	
	final int id;
	public Pratice1(int i) {
		System.out.println("Pratice1 " + i +" start()");
		id = i;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("pratice1");
			Thread.yield();
		}
		System.out.println("Task"+ id + " Finish");
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new Pratice1(i)).start();
		}
	}
}
