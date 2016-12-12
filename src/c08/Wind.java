package c08;

import javax.sound.midi.Instrument;

class Instruments{
	
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
	
}

public class Wind extends Instruments{
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

}
