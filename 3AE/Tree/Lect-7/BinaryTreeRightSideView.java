import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
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
    int vis=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        view(root,ll,0);
      return ll;
        
    }
    public void view(TreeNode root, List<Integer> ll,int curr){

        if(root==null){
            return ;
        }
        if(curr>vis){
            ll.add(root.val);
            vis=curr;
        }
        view(root.right,ll,curr+1);
        view(root.left,ll,curr+1);
    }
}
}
