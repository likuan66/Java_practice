package 代码专项练习.树;

/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBSTPractice {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return VerifySquenceOfBSTHepler(sequence,0,sequence.length-1);
    }

    private boolean VerifySquenceOfBSTHepler(int[] sequence, int start, int end) {
        if(start>=end){
            return true;
        }
        int root=sequence[end];
        int i=0;
        while(i<end&&sequence[i]<root){
            i++;
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<root){
                return false;
            }
        }
        return VerifySquenceOfBSTHepler(sequence,0,i-1)&&VerifySquenceOfBSTHepler(sequence,i,end-1);
    }
}
