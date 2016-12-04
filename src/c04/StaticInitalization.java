package c04;

public class StaticInitalization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main ");
		Object[] objects = {"1","2","2"};
	}
}
class Bowl{
	int[] a = new int[1000000000];
	public Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
		
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Table{
	static Bowl b1 = new Bowl(1);
	public Table() {
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int marker){
		System.out.println("f2(" + marker + ")");
		
	}
	static Bowl b2 = new Bowl(2);
}