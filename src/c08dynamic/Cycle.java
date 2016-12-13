package c08;

public class Cycle {
	public void ride(CycleType c) {
		System.out.println("Cycle ");
	}
	public static void testRide(Cycle c) {
		c.ride(CycleType.BICYCLE);
	}
	public static void main(String[] args) {
		UniCycle uniCycle = new UniCycle();
		TriCycle triCycle = new TriCycle();
		Bicycle b  = new Bicycle();
		testRide(uniCycle);
		testRide(triCycle);
		
	}
}


class UniCycle extends Cycle{
	@Override
	public void ride(CycleType cycleType) {
		System.out.println("Unistycle.ride() "+ cycleType);
	}
}

class TriCycle extends Cycle{
	@Override
	public void ride(CycleType cycleType) {
		System.out.println("TriCycle.ride()" + cycleType);
	}
}
class Bicycle extends Cycle{
	@Override
	public void ride(CycleType cycleType) {
		System.out.println("Bycle.ride()" + cycleType);
	}
}