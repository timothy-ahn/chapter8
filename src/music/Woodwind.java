package music;

public class Woodwind extends Wind {
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }
    public String what() {
        return "Woodwind";
    }
}
