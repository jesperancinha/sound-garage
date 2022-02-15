package org.jesperancinha.sound.garage;

import static javax.sound.midi.ShortMessage.NOTE_ON;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class SGSoundMachine {

	public static void playNotes(int[][] configuration, MidiDevice synth)
			throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {

		synth.open();
		for (int i = 0; i < configuration.length; i++) {
			ShortMessage myC1Msg = new ShortMessage();
			myC1Msg.setMessage(NOTE_ON, 4, configuration[i][0], 93);
			Receiver synthRcvr = synth.getReceiver();
			synthRcvr.send(myC1Msg, -1); // -1 means no time stamp
			Thread.sleep(configuration[i][1]);
		}
	}
}
