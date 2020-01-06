package demo08;

public class DemoGenericClass {
    public static void main(String[] args) {
        //创建一个泛型为String的类
        GenericClass<String> ge=new GenericClass<>();
        ge.setName("库里");
        String s=ge.getName();
        System.out.println(s);
        //创建一个泛型为Integer类
        GenericClass<Integer> ge1=new GenericClass<>();
        ge1.setName(1);
        Integer i=ge1.getName();
        System.out.println(i);
    }
}
