public class BSTLCA {
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return LCA(root,p,q);
          
        }
        public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
            if(root==null){
                return null;
            }
              if(root.val>p.val&&root.val>q.val){
                return LCA(root.left,p,q);
            }else if(root.val<p.val&&root.val<q.val){
                return LCA(root.right,p,q);
            }else{
                return root;
            }
        }
    }
 
}
