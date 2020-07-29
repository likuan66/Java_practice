package 算法;

public class FindNumsAppearOncePractice {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||num1==null||num2==null){
            return;
        }
        num1[0]=0;
        num2[0]=0;
        int ret=array[0];
        for(int i=1;i<array.length;i++){
            ret^=array[i];
        }
        int flag=1;
        for(int i=0;i<32;i++){
            if(((flag<<i)&ret)!=0){
                flag<<=i;
                break;
            }
        }
        for(int i=0;i<array.length;i++){
            if((array[i]&flag)==1){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }
}
