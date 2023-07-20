package memento;


import model.BookModel;

import java.util.LinkedList;

public class BookMemento {
    private final LinkedList<BookModel> bookStateStack = new LinkedList<>();
    public BookModel takePreviousBookState() {
        synchronized (bookStateStack) {
            return bookStateStack.pollFirst();
        }
    }
    public void storeNewBookState(BookModel bookState) {
        synchronized (bookStateStack) {
            bookStateStack.addFirst(bookState.clone());
        }
    }
}
