package music;

public class Brass extends Wind {
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
    public String what() {
        return "Brass";
    }
}
