package baseball;

public class Application {
    public static void main(String[] args) {
        UI ui = new UI();
        try {
            ui.start();
        } catch (Exception e) {
            return;
        }
    }
}
