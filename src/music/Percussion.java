package music;

public class Percussion extends Instrument {
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }
    public String what() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
