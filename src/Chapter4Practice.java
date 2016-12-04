
public class Chapter4Practice {
	public Chapter4Practice() {
		System.out.println("default construtor");
	}
	Chapter4Practice(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Chapter4Practice chapter4Practice = new Chapter4Practice();
		Chapter4Practice chapter4Practice2 = new Chapter4Practice("Hello world");
		Chapter4Practice[] chapter4Practices = new Chapter4Practice[]{new Chapter4Practice(),new Chapter4Practice("Hi")};
	}
}
