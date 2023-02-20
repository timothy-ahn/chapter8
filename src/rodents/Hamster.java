package rodents;

public class Hamster extends Rodent {
    private final Characteristic c = new Characteristic("Live at Home");
    private final Description d = new Description("Dummy Hamster");

    public Hamster(Color color) {
        super(color);
        System.out.println("Creating Hamster()");
    }

    public void run() {
        System.out.println("Hamster.run()");
    }
    public String kind() {
        return "Hamster";
    }

    public void dispose() {
        System.out.println("dispose() in Hamster");
        c.dispose();
        d.dispose();

        super.dispose();
    }
}
