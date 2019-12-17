package demo02;

public class DemoStaticField {
    public static void main(String[] args) {
        Student.room="412";
        Student one=new Student("杨幂",30);
        System.out.println("姓名："+one.getName()+",年龄："+one.getAge()+",教室："+one.room+",学号："+one.getId());
        Student two=new Student("胡歌",32);
        System.out.println("姓名："+two.getName()+",年龄："+two.getAge()+",教室："+two.room+",学号："+two.getId());
    }
}
