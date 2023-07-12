package main.java.org.designpattern.chainofresponsibility;

public class IntermidateLayer implements HelpInterface {
    final int INTERMIDATE_LAYER_HELP = 2;
    HelpInterface successor;
    public IntermidateLayer (HelpInterface s) {
        successor = s;
    }
    public void getHelp(int helpConstant) {
        if (helpConstant != INTERMIDATE_LAYER_HELP){
            successor.getHelp(helpConstant);
        } else {
            System.out.println("It's Intermidiate layer. Nice, eh?");
        }
    }
}
