
/**
 * BinarytreeColoring
 */
public class BinarytreeColoring {

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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
       
        find(root,x);
        
        int lc=count(p1.left);
        int rc=count(p1.right);
        
        
        return Math.max(lc,Math.max(rc,n-lc-rc-1))>n/2;
        
        
    }
    TreeNode p1=null;
    public void find(TreeNode node,int x){
        
        if(node==null||p1!=null)
            return;
        if(node.val==x)
            p1=node;
        find(node.left,x);
        find(node.right,x);
    }
    public int count(TreeNode node){
        
        if(node==null)
            return 0;
        
        return count(node.left)+count(node.right)+1;
    }
}
}