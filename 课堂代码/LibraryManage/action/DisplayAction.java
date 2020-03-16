package Homework.LibraryPractice.action;

import Homework.LibraryPractice.book.Book;
import Homework.LibraryPractice.book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}