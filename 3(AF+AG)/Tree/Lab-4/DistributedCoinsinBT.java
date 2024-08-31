public class DistributedCoinsinBT {
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
        int cnt=0;
        public int distributeCoins(TreeNode root) {
    
            coins(root);
            return cnt;
            
        }
        public int coins(TreeNode root){
            if(root==null){
                return 0;
            }
            int lc=coins(root.left);
            int rc=coins(root.right);
    
            cnt+=Math.abs(lc)+Math.abs(rc);
            return lc+rc+root.val-1;
        }
    }
}
