package Homework.LibraryPractice;

import Homework.LibraryPractice.book.BookList;
import Homework.LibraryPractice.user.Admin;
import Homework.LibraryPractice.user.NormalUser;
import Homework.LibraryPractice.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 创建数据
        BookList bookList = new BookList();
        // 2. 用户登陆
        User user = login();
        // 3. 进入主循环
        while (true) {
            // menu 在父类中存在, 在子类中也存在, 就构成了方法重写
            int choice = user.menu();
            user.doAction(choice, bookList);
        }
    }

    // 此时代码可以编译通过了. "向上转型"
    public static User login() {
        // 提示用户进行登录
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 请登录系统!!!!");
        System.out.println(" 请输入您的姓名: ");
        String name = scanner.next();
        System.out.println(" 请输入您的身份: 1 表示管理员, 2 表示普通用户 ");
        int who = scanner.nextInt();
        if (who == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }
}
