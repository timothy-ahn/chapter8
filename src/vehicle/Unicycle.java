package vehicle;

public class Unicycle extends Cycle {
    @Override
    public void ride() {
        wheels();
        System.out.println("Unicycle.ride()");
    }

    @Override
    public void wheels() {
        System.out.println("one wheel");
    }

    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}
