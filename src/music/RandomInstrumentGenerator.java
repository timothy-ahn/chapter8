package music;

import java.util.Random;

public class RandomInstrumentGenerator {
    private final Random rand = new Random();
    public Instrument next() {
        return switch (rand.nextInt(6)) {
            case 0 -> new Wind();
            case 1 -> new Percussion();
            case 2 -> new Stringed();
            case 3 -> new Woodwind();
            case 4 -> new Brass();
            case 5 -> new Keyboard();
            default -> null;
        };
    }
}
