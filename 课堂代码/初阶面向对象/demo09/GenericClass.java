package demo08;

public class GenericClass<E> {
    //（泛型）E在这里代表未知类型，之后传递什么就是什么类型
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
