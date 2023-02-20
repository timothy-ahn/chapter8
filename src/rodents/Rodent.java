package rodents;

public class Rodent {
    private final Characteristic c = new Characteristic("Live Everywhere");
    private final Description d = new Description("Simple Rodent");
    private final Color color;
    Rodent(Color color) {
        System.out.println("Creating Rodent()");
        this.color = color;
        this.color.addRef();
    }

    public void run() {
        System.out.println("Rodent.run()");
    }
    public String kind() {
        return "Rodent";
    }

    public void dispose() {
        System.out.println("dispose() in Rodent");
        c.dispose();
        d.dispose();
        color.dispose();
    }

    @Override
    public String toString() {
        return kind();
    }
}
