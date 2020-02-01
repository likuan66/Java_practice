package lanqiao;

import java.util.Scanner;

import static java.lang.Double.max;
import static java.lang.Double.min;


/*
    平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。
    对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 */
public class BASIC_18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        double m1,n1;//表示左上角的坐标
        double m2,n2;//表示右下角的坐标
        m1=max(min(x1,x2),min(x3,x4));
        n1=max(min(y1,y2),min(y3,y4));
        m2=min(max(x1,x2),max(x3,x4));
        n2=min(max(y1,y2),max(y3,y4));
        if(m2>m1&&n2>n1)
        System.out.print(String.format("%.2f",(m2-m1)*(n2-n1)));
        else
            System.out.println("0.00");
    }
}
