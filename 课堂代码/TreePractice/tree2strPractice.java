package biteHomework.TreePractice;

public class tree2strPractice {
    // 使用 sb 表示最终得到的字符串结果.
    // 递归过程中得到的局部结构都往 sb 中追加即可
    private StringBuilder sb=new StringBuilder();
    public String tree2str(TreeNode t) {
        if(t==null){
            //需要返回一个空字符串，而不是null
            return "";
        }
        //借助helper方法递归进行先序遍历
        helper(t);
        //递归得到最前面 和最后面的括号干掉即可
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void helper(TreeNode t) {
        if(t==null){
            return;
        }
        //访问根节点 此处访问操作追加字符串到sb中
        sb.append("(");
        sb.append(t.val);
        helper(t.left);
        if(t.left==null&&t.right!=null){
            //左子树为空  右子树不为空
            //一定要加上（）来占位
            sb.append("()");
        }
        helper(t.right);
        sb.append(")");
    }
}
