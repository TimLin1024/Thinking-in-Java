package c06;
class Insect{
	int i = 9;
	int j;
	public Insect() {
		prt("i = " + i +", j= " + j );
		j=39;
	}
	static int x1 = prt("static Insect.x1 initialized");

	static int prt(String s){
		System.out.println(s);
		return 47;
	}
	
}

public class Beetle extends Insect{
	int k = prt("static Beetle.k initialized");
	public Beetle() {
		prt("k= " + k);
		prt("j= " + j);
	}

	static int prt(String s) {
		System.out.println(s);
		return 63;
	}
	static int x2 = prt("static Beetle.x2 initialized");
	public static void main(String[] args) {
		prt("Beetle constructor");
		Beetle beetle = new Beetle();
	}
}
