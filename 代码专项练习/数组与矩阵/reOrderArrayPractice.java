package 代码专项练习.数组与矩阵;
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArrayPractice {
    public void reOrderArray(int [] array) {
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){//从左到右找奇数，将奇数放在k下标
                int temp=array[i];//先将奇数保存奇来
                int j=i;
                while(j>k){//将奇数之前的内容（偶数序列），整体后移一个位置
                    array[j]=array[j-1];
                    j--;
                }
                array[k++]=temp;//将奇数放在它将来改变的位置
            }
        }
    }
}
