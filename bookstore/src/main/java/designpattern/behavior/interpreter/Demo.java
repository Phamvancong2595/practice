package designpattern.behavior.interpreter;

public class Demo {

    public static void main(String[] args) {
        final AbstractExpression nonterminalExpression = new NonterminalExpression();
        final AbstractExpression terminalExpression = new TerminalExpression();
        final Context context = new Context("Hola Mundo");
        nonterminalExpression.interpret(context);
        terminalExpression.interpret(context);
        System.out.println(
                context.getInput() + " -> " +
                        context.getOutput()
        );

    }
}
