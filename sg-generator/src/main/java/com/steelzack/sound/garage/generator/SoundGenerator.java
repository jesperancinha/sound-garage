package com.steelzack.sound.garage.generator;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class SoundGenerator {

	public static void main(String[] args) throws Exception {
		// AudioClip clip = Applet.newAudioClip(
		// new URL("file://c:/blah/testFile.wav"));
		// clip.play();

		ShortMessage myMsg = new ShortMessage();
		// Play the note Middle C (60) moderately loud
		// (velocity = 93)on channel 4 (zero-based).
		myMsg.setMessage(ShortMessage.NOTE_ON, 4, 60, 93);
		MidiDevice synth = MidiSystem.getSynthesizer();
		synth.open();
		Receiver synthRcvr = synth.getReceiver();
		synthRcvr.send(myMsg, -1); // -1 means no time stamp

		Thread.sleep(5000);
	}
}
