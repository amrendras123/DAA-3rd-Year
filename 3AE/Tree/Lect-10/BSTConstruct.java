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

    public void BinarySearchTree(int[] arr){

        root=ConstructTree(arr,0,arr.length-1);
    }
    public TreeNode ConstructTree(int[] arr,int lo,int hi){

        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;

        TreeNode root=new TreeNode();
        root.val=arr[mid];

        root.left=ConstructTree(arr, lo, mid-1);
        root.right=ConstructTree(arr, mid+1, hi);

        return root;
    }
    public void preOrder(){
        preOrder(root);
      }
      private void preOrder(TreeNode node){
        if(node==null){
          return ;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
      }
      public int max(){
        return max(root);
      }
      private int max(TreeNode node){
        if(node==null){
          return Integer.MIN_VALUE;
        }
        int right=max(node.right);
  
        return Math.max(right,node.val);
      }
      public boolean find(int item){
        return find(root, item);
       }
       private boolean find(TreeNode node, int item){
   
         if(node==null){
           return false;
         }
         if(node.val==item){
           return true;
         }
         if(node.val>item){
         return find(node.left,item);
         }
         else{
           return find(node.right, item);
         }
   
        //  return left||right;
       }
}