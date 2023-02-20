package theater;

public class Starship {
    private AlertStatus alertStatus = new InfoAlert();

    public void info() {
        alertStatus = new InfoAlert();
    }
    public void warning() {
        alertStatus = new WarningAlert();
    }
    public void error() {
        alertStatus = new ErrorAlert();
    }

    public void show() {
        alertStatus.show();
    }
}
