package Homework.LibraryPractice.user;

import Homework.LibraryPractice.action.IAction;
import Homework.LibraryPractice.book.BookList;

// 此处加上 abstract 只是锦上添花
abstract public class User {
    protected String name = null;
    protected IAction[] actions = null;

    // 此处 menu 变成抽象方法也是锦上添花
    // 加上抽象之后, 此时如果要创建新的 User 的子类
    // 也就必须重写 menu
    abstract public int menu();

    public void doAction(int choice, BookList bookList) {
        this.actions[choice].work(bookList);
    }
}