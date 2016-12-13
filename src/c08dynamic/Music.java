package c08;

public class Music {
	public static void tune(Instruments i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
