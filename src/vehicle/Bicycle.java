package vehicle;

public class Bicycle extends Cycle {
    @Override
    public void ride() {
        wheels();
        System.out.println("Bicycle.ride()");
    }

    @Override
    public void wheels() {
        System.out.println("two wheels");
    }
}
