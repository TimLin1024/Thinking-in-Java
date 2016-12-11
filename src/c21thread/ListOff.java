package c21thread;

public class ListOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public ListOff() {
	}
	
	public ListOff(int countDown) {
		this.countDown = countDown;
	}
	
	private String status(){
		return "#" + id + "(" +( countDown > 0? countDown : "ListOff!") + ").";
	}
	
	@Override
	public void run() {
		while(countDown-->0){			
			System.out.print(status());
			Thread.yield();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListOff listOff = new ListOff();
		new Thread(listOff).start();
		System.out.println("Waiting for ListOff");
	}
}
