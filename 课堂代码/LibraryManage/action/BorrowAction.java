package Homework.LibraryPractice.action;


import Homework.LibraryPractice.book.Book;
import Homework.LibraryPractice.book.BookList;

import java.util.Scanner;

public class BorrowAction implements IAction{
    @Override
    public void work(BookList bookList){
        System.out.println("执行借书的操作");
        System.out.println("请输入你要借书的书名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        //先找到要借的书，把它的状态改为借出
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    continue;
                }else{
                    book.setBorrowed(true);
                    System.out.println("结束成功");
                    return;
                }
            }
        }
        System.out.println("借书失败，没有找到匹配的书");
    }
}
