package designpattern.behavior.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonterminalExpression implements AbstractExpression {
    private final List<AbstractExpression> children;
    public NonterminalExpression() {
        children = List.of(
                new HolaExpression(),
                new MundoExpression()
        );
    }
    @Override
    public void interpret(Context context) {
        final List<String> outputWords = new ArrayList<>();
        final String[] words =
                context.getInput().split(" ");
        for (String word: words) {
            outputWords.add(interpretWord(word));
        }
        context.setOutput(
                String.join(" ", outputWords)
        );

    }
    private String interpretWord(String word) {
        String wordOutput = word;
        for (AbstractExpression expression: children) {
            final Context wordContext = new Context(wordOutput);
            expression.interpret(wordContext);
            wordOutput = wordContext.getOutput();
        }
        return wordOutput;
    }
}
