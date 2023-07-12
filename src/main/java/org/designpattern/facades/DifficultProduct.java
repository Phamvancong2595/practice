package main.java.org.designpattern.facades;

public class DifficultProduct {
    char[] nameChars = new char[7];
    public DifficultProduct(){

    }
    public void setFirstNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setSecondNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setThirdNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setFourthNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setFifthNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setSixthNameCharacter(char c) {
        nameChars[0] = c;
    }
    public void setSeventhNameCharacter(char c) {
        nameChars[0] = c;
    }
    public String getName() {
        return new String(nameChars);
    }
}
