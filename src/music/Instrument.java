package music;

public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }
    public String what() {
        return "Instrument";
    }
    public void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}
