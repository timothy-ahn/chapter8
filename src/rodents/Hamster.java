package rodents;

public class Hamster extends Rodent {
    public void run() {
        System.out.println("Hamster.run()");
    }
    public String kind() {
        return "Hamster";
    }
}
