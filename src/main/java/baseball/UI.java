package baseball;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();
    boolean isAnswer;
    boolean finishGame = false;

    void start() {

        while (!finishGame) {
            System.out.print("숫자를 입력해주세요 : ");
            String input = scanner.next();

            controller.validateNumber(input);

            isAnswer = controller.checkAnswer();

            finishGame(isAnswer);
        }
    }

    private void finishGame(boolean isAnswer) {
        if (isAnswer) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = scanner.next();
            finishGame = controller.finishGame(input);
        }
    }
}
