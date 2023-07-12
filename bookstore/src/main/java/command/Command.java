package command;

public interface Command <R> {
    R execute() throws Exception;
}
