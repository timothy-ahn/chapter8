package theater;

public class WarningAlert extends AlertStatus {
    public void show() {
        System.out.println("\033[0;33m" + "WARNING: MESSAGE" + "\033[0m");
    }
}
