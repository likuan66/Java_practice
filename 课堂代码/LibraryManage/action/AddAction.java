package Homework.LibraryPractice.action;

import Homework.LibraryPractice.book.Book;
import Homework.LibraryPractice.book.BookList;

import java.util.Scanner;

public class AddAction implements IAction {
    @Override
    public void work(BookList bookList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("新增图书");
        System.out.println("请输入图书书名");
        String name=scanner.next();
        System.out.println("请输入作者");
        String auther=scanner.next();
        System.out.println("请输入价格");
        int price=scanner.nextInt();
        System.out.println("请输入类型");
        String type=scanner.next();
        //假设借书状态未借出
        Book book=new Book(name,auther,price,type,false);
        int size=bookList.getSize();
        bookList.setBook(size,book);
        bookList.setSize(size+1);
        System.out.println("新增图书成功");
    }
}
