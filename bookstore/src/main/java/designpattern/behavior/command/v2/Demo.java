package designpattern.behavior.command.v2;

public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(receiver);
        invoker.invoke("command1");
        invoker.invoke("command2");
    }
}
