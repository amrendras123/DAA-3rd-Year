import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RightSideViewIterative {
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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            int size=q.size();
            
            while(size>0){
                TreeNode rem=q.remove();
                
                if(size==1)
                    list.add(rem.val);
                if(rem.left!=null)
                    q.add(rem.left);
                if(rem.right!=null)
                    q.add(rem.right);
                
                size--;
            }
        }
        return list;
    }
}

}
