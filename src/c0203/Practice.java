package c0203;

public class Practice {
	public static void main(String[] args) {
//		printNum();
		testswitch();
	}

	private static void printNum() {
		for (int i = 1; i <= 100; i++) {
			if (i == 47) {
				return;
			}
			System.out.println(i);
		}
	}

	private static void testswitch() {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			// case 0:
			// System.out.println("i = " + i);
			// break;
			case 1:
				System.out.println("i = " + i);
				break;
			case 2:
				System.out.println("i = " + i);
				break;
			case 3:
				System.out.println("i = " + i);
				break;
			case 4:
				System.out.println("i = " + i);
				break;

			default:
				System.out.println("default i = " + i);

				break;
			}
		}
	}
}
