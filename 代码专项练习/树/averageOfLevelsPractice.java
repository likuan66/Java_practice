package 代码专项练习.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageOfLevelsPractice {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> list=new LinkedList<>();
        list.add(root);
        while(list.size()!=0){
            int len=list.size();
            double sum=0;
            for(int i=0;i<len;i++){
                TreeNode node=list.poll();
                sum+=node.val;
                if(node.left!=null){
                    list.add(node.left);
                }
                if(node.right!=null){
                    list.add(node.right);
                }
            }
            res.add(sum/len);
        }
        return res;
    }
}
