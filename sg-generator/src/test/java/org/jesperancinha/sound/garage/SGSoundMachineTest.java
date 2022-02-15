package org.jesperancinha.sound.garage;

import org.junit.Test;
import org.mockito.Mockito;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.Receiver;

import static org.jesperancinha.sound.garage.SoundGenerator.A2_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.Bb2_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.C1_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.C2_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.D1_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.E1_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.F1_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator.G1_NOTE;
import static org.jesperancinha.sound.garage.SoundGenerator._1000;
import static org.jesperancinha.sound.garage.SoundGenerator._1700;
import static org.jesperancinha.sound.garage.SoundGenerator._2000;
import static org.jesperancinha.sound.garage.SoundGenerator._500;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SGSoundMachineTest {

    /**
     * Just plays happy birthday!
     *
     * @throws Exception
     */
    @Test
    public void testPlayNotes() throws Exception {
        final MidiDevice mock = mock(MidiDevice.class);
        when(mock.getReceiver()).thenReturn(mock(Receiver.class));
        SGSoundMachine.playNotes(new int[][]{
                new int[]{C1_NOTE, _1000},
                new int[]{C1_NOTE, _500},
                new int[]{C1_NOTE, _500},
                new int[]{D1_NOTE, _1000},
                new int[]{C1_NOTE, _1000},
                new int[]{F1_NOTE, _1000},
                new int[]{E1_NOTE, _1700},
                new int[]{C1_NOTE, _500},
                new int[]{C1_NOTE, _500},
                new int[]{D1_NOTE, _1000},
                new int[]{C1_NOTE, _1000},
                new int[]{G1_NOTE, _1000},
                new int[]{F1_NOTE, _1700},
                new int[]{C1_NOTE, _500},
                new int[]{C1_NOTE, _500},
                new int[]{C2_NOTE, _1000},
                new int[]{A2_NOTE, _1000},
                new int[]{F1_NOTE, _1000},
                new int[]{E1_NOTE, _1000},
                new int[]{D1_NOTE, _1700},
                new int[]{Bb2_NOTE, _500},
                new int[]{Bb2_NOTE, _500},
                new int[]{A2_NOTE, _1000},
                new int[]{F1_NOTE, _1000},
                new int[]{G1_NOTE, _1000},
                new int[]{F1_NOTE, _2000},
        }, mock);
    }
}
