package interpreter;

import java.util.concurrent.ThreadLocalRandom;

public class AuthorCodeInterpreter implements Interpreter<String> {
    @Override
    public String translate(String input) {
        final String[] bookNameWorks = input.split(" ");
        final StringBuilder code = new StringBuilder();
        for (String word: bookNameWorks) {
            code.append(word.charAt(0));
        }
        final int randomNumber = ThreadLocalRandom
                .current()
                .nextInt(0, Short.MAX_VALUE);
        code.append(String.format("%05d", randomNumber));
        return code.toString();
    }
}
