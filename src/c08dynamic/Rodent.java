package c08dynamic;


import java.util.Random;


class Mouse extends Rodent{
	@Override
	protected void print() {
		System.out.println("I am Mouse");
	}
}
class Gerbil extends Rodent{
	@Override
	protected void print() {
		System.out.println("I am gerbil");
	}
}

class Hamster extends Rodent{
	@Override
	protected void print() {
		System.out.println("I am Hamster");
	}
	
	private void testPrivate() {
		System.out.println("hamster's private method");
	}
}

class RandomRodentGenerator{
	private Random random = new Random();
	public Rodent next() {
		switch (random.nextInt(3)) {
		case 0:
			return new Hamster();
		case 1:
			return new Mouse();
		case 2:
			return new Gerbil();
		default:
			return null;
		}
	}
}

public class Rodent {
/*	private �����൱��������final ������ǰ�ڰ󶨣�
	������д��ͬ�����������ø�������ȥ���ã�Ҳ����û�н��*/
	private void testPrivate() {
		System.out.println("rodent's private method");
	}
	
	public void printRealShape(Rodent r) {
		r.print();
	}

	protected void print() {
		System.out.println("I am rodent ");
	}
	
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[8];
		RandomRodentGenerator randomRodentGenerator = new RandomRodentGenerator();
		
		for (int i = 0; i < rodents.length; i++) {
			rodents[i] = randomRodentGenerator.next();
			
		}
		for(Rodent j: rodents){
			if (j != null) {
				j.printRealShape(j);
				if (j instanceof Hamster) {
					j.testPrivate();
				}
			}
		}
	}
	
}
