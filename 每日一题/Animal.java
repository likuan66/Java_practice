package Java复习的代码;

public class Animal {
    public void Animal(){
        System.out.println("hehe");
    }
    public void Name(){
        System.out.println("二狗");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("二哈");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();

    }
}
