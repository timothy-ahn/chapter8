package rodents;

public class Mouse extends Rodent {
    public void run() {
        System.out.println("Mouse.run()");
    }
    public String kind() {
        return "Mouse";
    }
}
