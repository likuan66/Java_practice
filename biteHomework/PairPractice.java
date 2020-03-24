package biteHomework;

class A<T>{
    T value;
    A(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}


public class PairPractice {
    public static void main(String[] args) {
        A<String> a=new A<>("hello");
        String str=a.get();
        System.out.println(str);

        a.setValue("world");
        str=a.get();
        System.out.println(str);
    }
}
