package music;

public class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
    public String what() {
        return "Wind";
    }
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}
