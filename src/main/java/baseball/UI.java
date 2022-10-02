package baseball;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);

    void start() {
        Controller controller = new Controller();

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            String input = scanner.next();
            controller.validateNumber(input);
            System.out.println("힌트");
        }
    }
}
