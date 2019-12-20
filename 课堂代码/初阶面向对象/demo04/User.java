package demo03;

public class User {
    private String name; //姓名
    private int money;  //余额，也就是当前用户拥有的钱数
    public User() {
    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //展示一下当前用户有多少钱
    public void show(){
        System.out.println("用户名:"+name+" , 余额为:" +money+ "元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
