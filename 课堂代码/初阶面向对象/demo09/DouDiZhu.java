package demo08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    斗地主综合案例：
            1.准备牌
            2.洗牌
            3.发牌
            4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组，一个数组来存储花色，一个数组来存储牌的序号
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到扑克中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for(String number:numbers){
            for (String color : colors) {
                //把组装好的牌放到集合中
                poker.add(number+color);
            }
        }

        /*
            2.洗牌：
                使用集合的工具类Collections中的方法
                static void shuffle(list<?> list)  使用默认随机源指定列表进行置换

         */
        Collections.shuffle(poker);
        //System.out.println(poker);
        /*
                3.发牌
         */
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3给三个玩家轮流发牌
            剩余三张底牌
            注意：
                先判断底牌（i>=51),否则就牌就发没了
         */
        for(int i=0;i<poker.size();i++){
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if(i>=51){
                //改底牌发牌
                dipai.add(p);
            }else if(i%3==0){
                //给玩家1发牌
                player1.add(p);
            }else if(i%3==1){
                //给玩家2发牌
                player2.add(p);
            }else if(i%3==2){
                player3.add(p);
            }
        }

        //4.看牌
        System.out.println("库里"+player1);
        System.out.println("詹姆斯"+player2);
        System.out.println("科比"+player3);
        System.out.println("底牌"+dipai);
    }
}
