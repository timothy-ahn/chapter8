package vehicle;

public class Tricycle extends Cycle {
    @Override
    public void ride() {
        wheels();
        System.out.println("Tricycle.ride()");
    }

    @Override
    public void wheels() {
        System.out.println("three wheels");
    }
}
