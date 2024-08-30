

public class SumofLeftLeaves {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
   }
}
    class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sum(root);
        
    }
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int sm=0;
        if(root.left!=null&&(root.left.left==null&&root.left.right==null)){
            sm=root.left.val;
        }
        return sm+sum(root.left)+sum(root.right);
    }
}
}
