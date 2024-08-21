/**
 * Flipequivalent
 */
public class Flipequivalent {

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
           public boolean flipEquiv(TreeNode root1, TreeNode root2) {
                return equi(root1,root2);
           }
           public boolean equi(TreeNode root1,TreeNode root2){
       
               if(root1==null&&root2==null){
                   return true;
               }
               if(root1==null||root2==null){
                   return false;
               }
               if(root1.val!=root2.val){
                   return false;
               }
       
               boolean noflip=equi(root1.left,root2.left)&&equi(root1.right,root2.right);
               boolean flip=equi(root1.left,root2.right)&&equi(root1.right,root2.left);
               
       
               return noflip||flip;
       
           }
           }
       
}