package c06;

public class Practice {
	public static void main(String[] args) {
		
		C c = new C(0);
	}
}
class A{
	public A(int i) {
		System.out.println("A");
	}
}

class B{
	public B(int i) {
		
		System.out.println("B");
	}
}

class C extends A{
	public C(int i) {
		super(i);
		B b = new B(1);
	}
}
