import java.util.*;

public class PracticeTree {
   public static class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;

       public TreeNode(int val) {
           this.val = val;
       }
   }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t){
       if(s==null||t==null){
           return false;
       }
       if(t==null&&s==null){
           return true;
       }
       boolean bit=false;
       if(s.val==t.val){
           bit=isSameTree(s,t);
       }
       return bit||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public boolean isBalanced(TreeNode root){
       if(root==null){
           return true;
       }
       if(root.left==null&&root.right==null){
           return true;
       }
       int left=maxDepth(root.left);
       int right=maxDepth(root.right);
       if(left-right>1||left-right<-1){
           return false;
       }
       return isBalanced(root.left)&&isBalanced(root.right);
    }
    public boolean isSymmetric(TreeNode root){
       if(root==null){
           return true;
       }
       return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return isMirror(left.left,left.right)&&isMirror(right.left,right.right);
    }
/*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            char[] c=sc.next().toCharArray();
            Stack<Character> stack=new Stack<>();
            stack.push(c[0]);
            for(int i=1;i<c.length-1;i++){
                if(c[i]=='#'){
                    System.out.print(stack.pop()+" ");
                }else{
                    stack.push(c[i]);
                }
            }
            System.out.println();
        }
    }

 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            TreeNode root=build(line);
            inOrder(root);
            System.out.println();
        }
    }

    private static void inOrder(TreeNode root) {

    }

    private static int index=0;
    private static TreeNode build(String line) {
        index=0;
        return createTreePreOrder(line);
    }

    private static TreeNode createTreePreOrder(String line) {
        char cur=line.charAt(index);
        if(cur=='#'){
            return null;
        }
        TreeNode root=new TreeNode(cur);
        index++;
        root.left=createTreePreOrder(line);
        index++;
        root.right=createTreePreOrder(line);
        return root;
    }
    /*
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count=queue.size();
            List<Integer> list=new ArrayList<>();
            while(count>0){
                TreeNode node=queue.poll();
                list.add(root.val);
                if(node.left!=null){
                    queue.add(node.left)
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }

     */
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {

        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

        levels.get(level).add(node.val);

        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
    private TreeNode lac=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        findNode(root,p,q);
        return lac;
    }

    private boolean findNode(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return false;
        }
        int left=findNode(root.left,p,q)?1:0;
        int right=findNode(root.right,p,q)?1:0;
        int mid=(root==p||root==q)?1:0;
        if(left+right+mid==2){
            lac=root;
        }
        return (left+right+mid)>0;
    }
    public TreeNode Convert(TreeNode pRootOfTree){
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return pRootOfTree;
        }
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode leftTail=left;
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if(left!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode right=Convert(pRootOfTree.right);
        if(right!=null){
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }
        return left==null?pRootOfTree:left;
    }
    private int index1;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        index1=0;
        return buiderTreeHelp(preorder,inorder,0,inorder.length);
    }

    private TreeNode buiderTreeHelp(int[] preorder, int[] inorder, int left, int right) {
        if(left>=right){
            return null;
        }
        if(index>=preorder.length){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;
        int pos=find(inorder,left,right,root.val);
        root.left=buiderTreeHelp(preorder,inorder,left,pos);
        root.right=buiderTreeHelp(preorder,inorder,pos+1,right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int tofind) {
        for(int i=left;i<right;i++){
            if(inorder[i]==tofind){
                return i;
            }
        }
        return -1;
    }
}
