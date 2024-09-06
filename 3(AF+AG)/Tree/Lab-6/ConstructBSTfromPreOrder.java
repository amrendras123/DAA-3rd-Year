public class ConstructBSTfromPreOrder {
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
        int i = 0;
     public TreeNode bstFromPreorder(int[] A) {
         return bstFromPreorder(A, Integer.MAX_VALUE);
     }
 
     public TreeNode bstFromPreorder(int[] A, int bound) {
         if (i == A.length || A[i] > bound) return null;
         TreeNode root = new TreeNode(A[i++]);
         root.left = bstFromPreorder(A, root.val);
         root.right = bstFromPreorder(A, bound);
         return root;
     }
 }
 
}
