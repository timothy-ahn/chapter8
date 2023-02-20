package theater;

public class ErrorAlert extends AlertStatus {
    public void show() {
        System.out.println("\033[0;31m" + "ERROR: MESSAGE" + "\033[0m");
    }
}
