public class MaxPathSum {
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
           int minCam=0;
           public int minCameraCover(TreeNode root) {
       
               if(min(root)==-1){
                   minCam++;
               }
               return minCam;
               
           }
           public int min(TreeNode root){
       
               if(root==null){
                   return 1;
               }
               int l=min(root.left);
               int r=min(root.right);
               if(l==-1||r==-1){
                   minCam++;
                   return 0;
               }
               if(l==0||r==0){
                   return 1;
               }
               return -1;
           }
       }
}
