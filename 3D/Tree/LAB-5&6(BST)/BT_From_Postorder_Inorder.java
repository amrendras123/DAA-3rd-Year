import java.util.HashMap;

public class BT_From_Postorder_Inorder {
    
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
       HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int in=inorder.length-1;
        int pos=postorder.length-1;
        return constr(postorder,0,pos,inorder,0,in);
    }
    public TreeNode constr(int[] post,int ps,int pe,int[] ino,int is,int ie){
        
        if(ps>pe||is>ie){
            return null;
        }
        TreeNode root=new TreeNode();
        root.val=post[pe];
        int idx=map.get(post[pe]);
        
        int count=idx-is;
        
        root.left=constr(post,ps,ps+count-1,ino,is,idx-1);
        root.right=constr(post,ps+count,pe-1,ino,idx+1,ie);
        
        return root;
    }
}

}
