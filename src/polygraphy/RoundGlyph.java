package polygraphy;

public class RoundGlyph extends Glyph {
    private int radius = 1;
    public RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    public void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
