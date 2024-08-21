public class SumrootToLeaf {
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
         class Solution {
            public int sumNumbers(TreeNode root) {
                
                return sum(root,0);
                
            }
            public int sum(TreeNode node,int num){
                if(node==null)
                    return 0;
                if(node.left==null&&node.right==null)
                    return num*10+node.val;
                
                int lr=sum(node.left,num*10+node.val);
                int rr=sum(node.right,num*10+node.val);
                
                return lr+rr;
            }
        }
}
}
