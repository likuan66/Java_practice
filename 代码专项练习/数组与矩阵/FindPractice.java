package 代码专项练习.数组与矩阵;

/*
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindPractice {
    public boolean Find(int target, int [][] array) {
        if(array==null){
            return false;
        }
        int j=array[0].length-1;
        int i=0;
        while(i<array.length&&j>=0){//从第一行第一个元素开始查找
            if(target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
