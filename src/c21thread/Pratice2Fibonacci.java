package c21thread;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pratice2Fibonacci implements Runnable{
	
	private int num ;
	public Pratice2Fibonacci(int n) {
		num = n;
	}
	
	private int[] generateFibonacci(int n){
		int[] ary = new int[n];
		ary[0] = 1;
		ary[1] = 1;
		for (int i = 2; i < ary.length; i++) {
			ary[i] = ary[i-1] + ary[i-2];
		}
		
		return ary;
	}
	@Override
	public void run() {
		System.out.println("Fibonacci array"+ num +" "+ Arrays.toString(generateFibonacci(num)) );
	}
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 3; i < 10; i++) {
//			new Thread(new Pratice2Fibonacci(i)).start();
			executorService.execute(new Pratice2Fibonacci(i));
		}
		executorService.shutdown();
		
	}
}
