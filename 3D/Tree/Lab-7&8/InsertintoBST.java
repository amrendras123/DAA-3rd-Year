public class InsertintoBST {
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
           
            if(root==null){
                
                TreeNode nn=new TreeNode(val);
                return nn;
            }
            add(root,val);
            return root;
        }
        public void add(TreeNode root,int val){
            
            
            if(val>root.val){
                
                if(root.right==null){
                    TreeNode nn=new TreeNode(val);
                    root.right=nn;
                }else
                    add(root.right,val);
            }else {
                if(root.left==null){
                    TreeNode nn=new TreeNode(val);
                    root.left=nn;
                }else
                    add(root.left,val);
            }
        }
    }
    
}
