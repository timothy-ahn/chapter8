package theater;

public class InfoAlert extends AlertStatus {
    public void show() {
        System.out.println("\033[4;34m" + "INFO: MESSAGE" + "\033[0m");
    }
}
