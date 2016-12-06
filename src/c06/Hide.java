package c06;

class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}
class Milhouse{
	
}
class Bart extends Homer{
	void doh(Milhouse m){
		System.out.println("Milhouse");
	}
}
class Hide {
	public static void main(String[] args) {
		Bart bart = new Bart();
		bart.doh(1);
		bart.doh('x');
		bart.doh(1.0f);
		bart.doh(new Milhouse());
	}
}
