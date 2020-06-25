package bite每日一题;

/*
在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，
请编写一个函数，使用递归的方法生成N位的格雷码。
给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 */
public class day16 {
    public String[] getGray(int n){
        String[] ret=null;
        if(n==1){
            ret=new String[]{"0","1"};
        }else{
            String[] strs=getGray(n-1);
            ret=new String[2*strs.length];
            for(int i=0;i<strs.length;i++){
                ret[i]="0"+strs[i];
                ret[ret.length-1-i]="1"+strs[i];
            }
        }
        return ret;
    }
}
