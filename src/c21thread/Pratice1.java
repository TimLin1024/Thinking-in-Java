package c21thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pratice1 implements Runnable{
	
	final int id;
	public Pratice1(int i) {
		System.out.println("Pratice1 " + i +" start()");
		id = i;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(id+" pratice1.run() " + i);
			Thread.yield();
		}
		System.out.println("Task"+ id + " Finish");
	}
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 18; i++) {
//			new Thread(new Pratice1(i)).start();
			executorService.execute(new Pratice1(i));
		}
		executorService.shutdown();
	}
}
