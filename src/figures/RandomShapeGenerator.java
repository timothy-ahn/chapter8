package figures;

import java.util.Random;

public class RandomShapeGenerator {
    private final Random rand = new Random();
    public Shape next() {
        return switch (rand.nextInt(4)) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Triangle();
            case 3 -> new Rhombus();
            default -> null;
        };
    }
}
