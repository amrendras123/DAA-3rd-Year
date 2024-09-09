/**
 * RangeSumBSt
 */
public class RangeSumBSt {

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
        public int rangeSumBST(TreeNode root, int low, int high) {
            
            if(root==null){
                return 0;
            }
            if(root.val<low){
                return rangeSumBST(root.right,low,high);
            }else if(root.val>high){
                return rangeSumBST(root.left,low,high);
            }else{
                int rsum=rangeSumBST(root.right,low,high);
                int lsum=rangeSumBST(root.left,low,high);
                return root.val+rsum+lsum;
            }
        }
    }
}