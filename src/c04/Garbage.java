package c04;

public class Garbage {
	public static void main(String[] args) {
		if (args.length != 0) {
			System.err.println("Usage:\n" + 
	"java Garbage before\n  or:\n"+
					"java Garbge after");
			return;
		}

		while(!Chair.f){
			new Chair();
			new String("To take up space");
		}
		System.out.println("After all Chair have been created" + 
		"total created = " + Chair.finalized);
		
	}
	
		
}

class Chair{
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;
	public Chair() {
		i = ++created;
		if (created == 47) {
			System.out.println("Created 47");
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		if (!gcrun) {
			gcrun = true;
			System.out.println(
					"Beginning to finalize after " + created + " Chairs have been created");
		}
		if (i == 47) {
			System.out.println(
					"Finalizing Chair #47, "+
			"Setting flag to stop chair created");
			f = true;
		}
		finalized++;
		if (finalized >= created) {
			System.out.println("All " + finalized + " finalized");
		}
	}
}
