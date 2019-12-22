package demo03;

import java.util.ArrayList;

//群主的类
public class Manage extends User {
    public Manage() {
    }
    public Manage(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合来存储若干红包的集合
        ArrayList<Integer> redList=new ArrayList<>();
        //首先看一下群主有多少钱
        int leftMoney=super.getMoney();//群主当前余额
        if(totalMoney>leftMoney){
            System.out.println("余额不足！");
            return redList;//返回一个空的集合

        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney-totalMoney);
        //发红包需要拆分成为count份
        int avg=totalMoney/count;
        int mod=totalMoney%count; //余数，零头
        //剩下的零头放到最后一个红包中
        //接下来把红包一个一个放在集合中
        for(int i=0;i<count-1;i++){
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);

        return redList;
    }
}
