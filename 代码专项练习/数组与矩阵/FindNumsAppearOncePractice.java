package 代码专项练习.数组与矩阵;
//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
public class FindNumsAppearOncePractice {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||num1==null||num2==null){
            return;
        }
        num1[0]=0;
        num2[0]=0;
        int result=array[0];
        for(int i=1;i<array.length;i++){
            result^=array[i];
        }
        int flag=1;
        for(int i=0;i<32;i++){//从最低位到最高位找，找到第一个为1的位置
            if(((flag<<i)&result)!=0){
                flag<<=i;
                break;
            }
        }
        for(int i=0;i<array.length;i++){
            int l = (flag&array[i]);
            if((flag&array[i])!=0){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,3,6,3,2,5,5};
        int[] num1=new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(arr,num1,num2);
        System.out.println(num1[0]+"+++"+num2[0]);
    }
}
