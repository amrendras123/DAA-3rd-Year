/**
 * BSTConstruct
 */
public class BSTConstruct {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    };
    private TreeNode root;

    public void Binary_Search_Tree(int[] in){

        root=CreateTree(in,0,in.length-1);
    }
    private TreeNode CreateTree(int[] in,int si, int ei){
    
        if(si>ei){
            return null;
        }
        TreeNode root=new TreeNode();
        
        int mid=(si+ei)/2;
        root.val=in[mid];

        root.left=CreateTree(in, si, mid-1);
        root.right=CreateTree(in, mid+1, ei);
        return root;
    }
    public void pre(){
        preorder(root);
    }
    private void preorder(TreeNode root){

        if(root==null){
            return ;
        }
        System.out.print(root.val+"->");
        preorder(root.left);
        preorder(root.right);

    }
}