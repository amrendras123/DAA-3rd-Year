public class LongestUnivaluePath {
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
        int path=0;
        public int longestUnivaluePath(TreeNode root) {
            Uniq(root);
            return path;
        }
        public int Uniq(TreeNode root){
            if(root==null){
                return 0;
            }
            int lc=0,rc=0;
            int lh=Uniq(root.left);
            int rh=Uniq(root.right);
    
            if((root.left!=null)&&root.left.val==root.val){
                lc=lh+1;
            }
            if((root.right!=null)&&root.right.val==root.val){
                rc=rh+1;
            }
            path=Math.max(path,lc+rc);
            return Math.max(lc,rc);
        }
    }
}
