package biteHomework.ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card{
    private String rank;//点数
    private String suit;//花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
public class Poker {
    public static void main(String[] args) {
        //1.创建一副扑克牌
        List<Card> poker=buyPoker();
        //2.洗牌，直接使用Collections.shuffle
        Collections.shuffle(poker);
        //3.发牌，假设有三个玩家，每人发5张牌
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                List<Card> player=players.get(j);
                Card card=poker.remove(0);
                player.add(card);
            }
        }
        for(int i=0;i<3;i++){
            System.out.println("玩家"+i+":"+players.get(i));
        }
    }
    private static List<Card> buyPoker(){
        List<Card> poker=new ArrayList<>();
        String[] suits={"♠","♣","♦","♥"};
        for(int i=0;i<4;i++){
            for(int j=2;j<=10;j++){
                poker.add(new Card(""+j,suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return poker;
    }
}
