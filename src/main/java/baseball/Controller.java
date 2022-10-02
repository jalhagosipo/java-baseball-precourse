package baseball;

public class Controller {

    private static String REGEX_PATTERN = "[1-9]{3}";

    String validateNumber(String number) {
        if (number.matches(REGEX_PATTERN)) {
            return number;
        }
        throw new IllegalArgumentException();
    }
}
