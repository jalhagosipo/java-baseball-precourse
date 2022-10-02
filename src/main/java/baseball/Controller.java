package baseball;

public class Controller {

    private static String REGEX_PATTERN = "[1-9]{3}";
    private String input;

    void validateNumber(String number) {
        if (!number.matches(REGEX_PATTERN)) {
            throw new IllegalArgumentException();
        }
        this.input = number;
    }

    boolean checkAnswer() {
        // TODO 힌트 출력 -> 볼 or 스트라이크 or 낫싱
        // 답맞춤
        return true;
    }

    boolean finishGame(String endInput) {
        if (endInput.equals("2")) {
            return true;
        }
        return false;
    }
}
