package org.jesperancinha.sound.garage.steelzack.sound.garage.generator;

import org.junit.Test;

public class SGSoundMachineTest {
	private static final int _1700 = 1700;
	private static final int _1000 = 1000;
	private static final int _500 = 500;
	private static final int _2000 = 2000;
	public static final int //
	C1_NOTE = 60, //
			D1_NOTE = 62, //
			E1_NOTE = 64, //
			F1_NOTE = 65, //
			G1_NOTE = 67, //
			A2_NOTE = 69, //
			Bb2_NOTE = 70, //
			B2_NOTE = 71, //
			C2_NOTE = 72;

	/**
	 * Just plays happy birthday!
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPlayNotes() throws Exception {
		SGSoundMachine.playNotes(new int[][] { //
				new int[] { C1_NOTE, _1000 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { D1_NOTE, _1000 }, //
				new int[] { C1_NOTE, _1000 }, //
				new int[] { F1_NOTE, _1000 }, //
				new int[] { E1_NOTE, _1700 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { D1_NOTE, _1000 }, //
				new int[] { C1_NOTE, _1000 }, //
				new int[] { G1_NOTE, _1000 }, //
				new int[] { F1_NOTE, _1700 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { C1_NOTE, _500 }, //
				new int[] { C2_NOTE, _1000 }, //
				new int[] { A2_NOTE, _1000 }, //
				new int[] { F1_NOTE, _1000 }, //
				new int[] { E1_NOTE, _1000 }, //
				new int[] { D1_NOTE, _1700 }, //
				new int[] { Bb2_NOTE, _500 }, //
				new int[] { Bb2_NOTE, _500 }, //
				new int[] { A2_NOTE, _1000 }, //
				new int[] { F1_NOTE, _1000 }, //
				new int[] { G1_NOTE, _1000 }, //
				new int[] { F1_NOTE, _2000 }, //
		});
	}
}
