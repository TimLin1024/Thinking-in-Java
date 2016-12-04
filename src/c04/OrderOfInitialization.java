package c04;

class Tag {
	public Tag(int marker) {
		System.out.println("Tag(" + marker + ")");
	}
}
class Card{
	Tag t1 = new Tag(1);
	public Card() {
		System.out.println("Card()");
		t3 = new Tag(33);
	}
	Tag t2 = new Tag(2);
	void f(){
		System.out.println("f()");
	}
	
	Tag t3 = new Tag(3);
}
public class OrderOfInitialization {
	public static void main(String[] args) {
		Card tCard = new Card();
		tCard.f();//shows that construction is done
	}
}

