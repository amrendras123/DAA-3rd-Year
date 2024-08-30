import java.util.ArrayList;
import java.util.List;


/**
 * BinaryTreePath
 */
public class BinaryTreePath {

    
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
    public List<String> binaryTreePaths(TreeNode root) {
             
     ArrayList<String> path=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        preorder(root,path,sb);
        return path;
    }
    public void preorder(TreeNode root,ArrayList<String> path,StringBuilder sb){
        if(root==null)return;
        if(root.left==null && root.right==null){
            sb.append(root.val);
            String s=sb.toString();
            path.add(s);
            return;
        }
        sb.append(root.val+"->");
        preorder(root.left,path,new StringBuilder(sb));
        preorder(root.right,path,new StringBuilder(sb));
    }
}

}