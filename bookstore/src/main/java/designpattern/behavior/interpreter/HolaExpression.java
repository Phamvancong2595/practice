package designpattern.behavior.interpreter;

public class HolaExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        if ("Hola".equals(context.getInput())) {
            context.setOutput("Hello");
        }
    }
}
