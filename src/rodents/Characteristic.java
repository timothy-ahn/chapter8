package rodents;

public class Characteristic {
    private final String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Crating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("Ending Characteristic " + s);
    }
}
