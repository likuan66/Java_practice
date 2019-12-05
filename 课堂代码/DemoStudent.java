package demo1;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("胡歌");
        stu1.setAge(21);
        System.out.println("姓名: "+stu1.getName()+",年龄： "+stu1.getAge());
        System.out.println("*******************");
        Student stu2=new Student("热巴",22);
        System.out.println("姓名: "+stu2.getName()+",年龄： "+stu2.getAge());
        System.out.println("*******************");
        stu2.setAge(27);
        System.out.println("姓名: "+stu2.getName()+",年龄： "+stu2.getAge());
    }
}
