package designpattern.behavior.memento.v2;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextEditor {
    @Getter
    private String currentContent;
    private final Memento<String> memento = new Memento<>();
    public void edit(String content) {
        if (currentContent != null) {
            memento.push(currentContent);
        }
        currentContent = content;
    }
    public void undo() {
        currentContent = memento.pop();
    }
    public static class Memento<T> {
        private final Deque<T> stack = new ArrayDeque<>();
        public void push(T state) {
            stack.addFirst(state);
        }
        public T pop() {
            return stack.removeFirst();
        }
    }

    public static void main(String[] args) {
        final TextEditor textEditor = new TextEditor();
        textEditor.edit("Content 1");
        textEditor.edit("Content 2");
        textEditor.undo();
        System.out.println(textEditor.getCurrentContent());
    }
}
