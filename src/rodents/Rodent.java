package rodents;

public class Rodent {
    public void run() {
        System.out.println("Rodent.run()");
    }
    public String kind() {
        return "Rodent";
    }

    @Override
    public String toString() {
        return kind();
    }
}
