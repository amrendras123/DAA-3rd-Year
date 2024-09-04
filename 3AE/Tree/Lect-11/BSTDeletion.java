public class BSTDeletion {
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
           public TreeNode deleteNode(TreeNode root, int key) {
            return del(root,key);
           }
           public TreeNode del(TreeNode root,int key){
               if(root==null){
                   return null;
               }
               if(root.val>key){
                   root.left=del(root.left,key);
               }else if(root.val<key){
                   root.right=del(root.right,key);
               }else{
                   if(root.left!=null&&root.right!=null){
                       int lmax=max(root.left);
                       root.val=lmax;
                       root.left=del(root.left,lmax);
                   }else if(root.left!=null){
                       return root.left;
                   }else if(root.right!=null){
                       return root.right;
                   }else{
                       return null;
                   }
               }
               return root;
           }
           public int max(TreeNode root){
               if(root==null){
                   return Integer.MIN_VALUE;
               }
               return Math.max(root.val,max(root.right));
           }
       }
}
