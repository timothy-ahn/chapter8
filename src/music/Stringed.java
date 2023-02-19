package music;

public class Stringed extends Instrument {
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }
    public String what() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
