package c06;

public class SprinklerSystem {
	private String value1, value2, value3, value4;
	private int i;
	private float f;
	
	WaterSource source;

	void print(){
		System.out.println("value1 " + value1);
		System.out.println("value2 " + value2);
		System.out.println("value3 " + value3);
		System.out.println("value4 " + value4);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("source "+ source);
	}
	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		sprinklerSystem.print();
		System.out.println(sprinklerSystem.f);
	}
}

class WaterSource{
	private String s;
	public WaterSource() {
		System.out.println("WaterSource");
		s = new String("Constructed");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
}
