package 算法.常见的字符串算法;

//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
// 则经过替换之后的字符串为We%20Are%20Happy。
public class 替换空格 {
    //①常规方法
    public static String replaceSpace(StringBuffer str){
        int len=str.length();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<len;i++){
            char b=str.charAt(i);
            if(String.valueOf(b).equals(" ")){
                result.append("%20");
            }else{
                result.append(b);
            }
        }
        return result.toString();
    }
    //②利用 API 解决
    public static String replaceSpqce(StringBuffer str){
        return str.toString().replaceAll("\\s","%20");
    }
}
