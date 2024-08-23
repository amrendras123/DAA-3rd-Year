/**
 * PopulatingNextPointer
 */
public class PopulatingNextPointer {
    public class TreeNode {
        int val;
         TreeNode left;
         TreeNode right;
         TreeNode next;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
        }
    class Solution {
        public TreeNode connect(TreeNode root) {
            TreeNode temp=root;
    
            while(temp!=null&&temp.left!=null){
    
                TreeNode n=temp;
                while(true){
                    n.left.next=n.right;
                    if(n.next==null){
                        break;
                    }
                    n.right.next=n.next.left;
                    n=n.next;
                }
            temp=temp.left;
    
            }
            return root;
        }
        
    }
}