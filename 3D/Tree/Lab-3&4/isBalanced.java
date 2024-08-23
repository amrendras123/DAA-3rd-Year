public class isBalanced {
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
        public boolean isBalanced(TreeNode root) {
            return Balanced(root);
            
        }
        public boolean Balanced(TreeNode root){
            if(root==null){
                return true;
            }
    
    
            boolean lb=Balanced(root.left);
            boolean rb=Balanced(root.right);
    
            Boolean sb=Math.abs(ht(root.left)-ht(root.right))<=1;
            return lb&&rb&&sb;
    
        }
    
        public int ht(TreeNode root){
            if(root==null){
                return -1;
            }
            int lh=ht(root.left);
            int rh=ht(root.right);
            return Math.max(lh,rh)+1;
        }
    }
}
