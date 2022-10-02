package baseball;

public class Controller {

    private static String REGEX_PATTERN = "[1-9]{3}";
    private static String END_GAME = "2";
    private String input;

    void validateNumber(String number) {
        if (!number.matches(REGEX_PATTERN)) {
            throw new IllegalArgumentException();
        }
        this.input = number;
    }

    String checkAnswer() {
        // TODO 힌트 출력 -> 볼 or 스트라이크 or 낫싱
        // 답맞춤
        return "3스트라이크";
    }

    boolean finishGame(String endInput) {
        if (endInput.equals(END_GAME)) {
            return true;
        }
        return false;
    }
}
