package designpattern.behavior.interpreter;

public class MundoExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        if ("Mundo".equals(context.getInput())) {
            context.setOutput("World");
        }
    }
}
