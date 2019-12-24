package demo05;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer=new Computer();
        computer.powerOn();

        //准备鼠标供电脑使用
        Mouse mouse=new Mouse();
        //首先进行向上转型
        USB usb=mouse; //多态写法
        //参数是USB类型
        computer.useDevice(usb);

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();//这里没有使用多态写法
        //方法参数是USB类型，传进去的是一个实现类
        computer.useDevice(keyboard);//发生了向上转型

        computer.powerof();
    }
}
