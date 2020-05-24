package 每日一题;

public class day08 {
    /*
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
个整数，判断数组中是否含有该整数。
 */
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(target==array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    /*
    请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
    则经过替换之后的字符串为We%20Are%20Happy。
     */
    public String replaceSpace(StringBuffer str) {
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                n+=2;
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
