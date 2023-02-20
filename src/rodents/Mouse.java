package rodents;

public class Mouse extends Rodent {
    private final Characteristic c = new Characteristic("Live in wild-hood");
    private final Description d = new Description("Wild Mouse");

    public Mouse(Color color) {
        super(color);
        System.out.println("Creating Mouse()");
    }

    public void run() {
        System.out.println("Mouse.run()");
    }
    public String kind() {
        return "Mouse";
    }

    public void dispose() {
        System.out.println("dispose() in Mouse");
        c.dispose();
        d.dispose();

        super.dispose();
    }
}
