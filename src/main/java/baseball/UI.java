package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UI {
    Controller controller = new Controller();
    String hint;
    boolean finishGame = false;

    void start() {

        while (!finishGame) {
            System.out.print("숫자를 입력해주세요 : ");
            String input = readLine();

            controller.validateNumber(input);

            hint = controller.checkAnswer();

            finishGame(hint);
        }
    }

    void finishGame(String hint) {
        if (hint.equals("3스트라이크")) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = readLine();
            finishGame = controller.finishGame(input);
        }
    }
}
