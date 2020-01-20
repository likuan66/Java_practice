package demo10;

import java.nio.file.FileAlreadyExistsException;

/*
        throws处理异常时应该注意：
            1.throws关键字必须写在方法的声明处
            2.throws关键字后声明的异常Exception或者是Exception子类
            3.方法的内部如果抛出了多个异常的对象，那么throws后边也必须声明多个异常
                如果抛出多个异常有父子类的关系，那么直接声明父类异常即可
            4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
                要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
                要么try 。。。catch自己处理异常
 */
public class DemoThrows {
    public static void main(String[] args) throws FileAlreadyExistsException {
        readFile("d:\\a.txt");
    }
    public static void readFile(String filename) throws FileAlreadyExistsException {
        if(!filename.equals("c:\\a.txt")){
             throw new FileAlreadyExistsException("传递的路径不是：c:\\a.txt");
        }
    }
}

