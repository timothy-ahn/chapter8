package polygraphy;

public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before call draw");
        draw();
        System.out.println("Glyph() after call draw");
    }
}
