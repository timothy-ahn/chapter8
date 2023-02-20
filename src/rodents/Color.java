package rodents;

public class Color {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    private final String code;
    public Color(String code) {
        this.code = code;
        System.out.println("Creating Color " + code);
    }

    public void addRef() {
        refCount++;
    }

    public void dispose() {
        if (--refCount == 0)
            System.out.println("Disposing " + this);
    }

    @Override
    public String toString() {
        return "Color " + id + " " + code;
    }
}
