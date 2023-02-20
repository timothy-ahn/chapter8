package rodents;

public class Description {
    private final String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose() {
        System.out.println("Ending Description " + s);
    }
}
