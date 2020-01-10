package demo10;

import java.util.Objects;

/*
        Objects中的静态方法：
        public static <T> T requireNonNull(T obj);查看指定引用对象是不是null
         源码：
                public static <T> T requireNonNull(T obj){
                    if(obj==null){
                        throw new NullPointerException();
                        return obj;
                     }
               }
 */
public class DemoObject {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object object){
        /*if(object==null){
            throw new NullPointerException("传递的对象为空");
        }*/
        //Objects.requireNonNull(object);
        Objects.requireNonNull(object,"传递的对象为空");
    }
}
