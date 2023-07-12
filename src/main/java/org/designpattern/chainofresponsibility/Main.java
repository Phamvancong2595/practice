package main.java.org.designpattern.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        final int FRONT_END_HELP = 1;
        final int INTERMIDATE_LAYER_HELP = 2;
        final int GENERAL_HELP = 3;
        Application app = new Application();
        IntermidateLayer intermidateLayer = new IntermidateLayer(app);
        intermidateLayer.getHelp(INTERMIDATE_LAYER_HELP);
    }
}
