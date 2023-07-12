package main.java.org.designpattern.chainofresponsibility;

public class FrontEnd implements HelpInterface {
    final int FRONT_END_HELP = 1;
    HelpInterface sucessor;
    public FrontEnd (HelpInterface s) {
        sucessor = s;
    }
    public void getHelp(int helpConstant) {
        if(helpConstant != FRONT_END_HELP) {
            sucessor.getHelp(helpConstant);
        } else {
            System.out.println("This is the frontend. Don't you like it ?");
        }
    }
}
