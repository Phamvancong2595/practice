package designpattern.behavior.interpreter;

public class TerminalExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        if ("Hello World".equals(context.getInput())) {
            context.setOutput("Xin chao the gioi");
        }
    }
}
