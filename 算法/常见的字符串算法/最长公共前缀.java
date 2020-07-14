package 算法.常见的字符串算法;

// 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串
public class 最长公共前缀 {
    public static String longestCommonPrefix(String[] strs){
        String s="";
        int flag=1;
        if(strs.length==1){
            return s;
        }
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);//直接选择第一个数组元素，依次取这个字符串的字符
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length()){//因为每个字符串长度不同，防止溢出
                    flag=1;
                    break;
                }
                if(a!=strs[j].charAt(i)){//只要存在不同，直接退出
                    flag=1;
                    break;
                }else{
                    if(j==strs.length-1){
                        s=s+a;
                    }
                }
            }
            if(flag==1){
                break;
            }
        }
        return s;
    }
}
