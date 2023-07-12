package designpattern.behavior.interpreter;

import lombok.Data;

@Data
public class Context {
    private String input;
    private String output;
    public Context(String input) {
        this.input = input;
        this.output = input;
    }
}
