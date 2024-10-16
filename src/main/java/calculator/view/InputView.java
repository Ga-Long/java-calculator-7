package calculator.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_ADDITION_STRING = "덧셈할 문자열을 입력해 주세요.";

    public static String addtionString() {
        System.out.println(INPUT_ADDITION_STRING);
        return readLine();
    }
}
