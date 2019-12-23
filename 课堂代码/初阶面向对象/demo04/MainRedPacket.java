package demo03;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manage manage=new Manage("群主",100);

        Member one=new Member("成员A",0);
        Member two=new Member("成员B",10);
        Member three=new Member("成员C",20);

        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============================");
        //群主总共发20，总共3个红包
        ArrayList<Integer> redList=manage.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manage.show();
        one.show();
        two.show();
        three.show();
    }
}
