package music;

public class Keyboard extends Instrument {
    public void play(Note note) {
        System.out.println("Keyboard.play() " + note);
    }
    public String what() {
        return "Keyboard";
    }
    public void adjust() {
        System.out.println("Adjusting Keyboard");
    }
}
