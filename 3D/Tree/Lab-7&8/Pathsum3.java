import java.util.HashMap;

public class Pathsum3 {
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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
       if(root==null)
           return 0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        psum(root,targetSum,0,map);
        return count;
    }
    public void psum(TreeNode root,int tsum,int sum,HashMap<Integer,Integer>map){
        if(root==null)
            return;
        sum+=root.val;
        if(map.containsKey(sum-tsum))
            count+=map.get(sum-tsum);
        map.put(sum,map.getOrDefault(sum,0)+1);
        psum(root.left,tsum,sum,map);
        psum(root.right,tsum,sum,map);
        map.put(sum,map.get(sum)-1);
        return;
    }
}
}
