import java.util.Scanner;
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
    Scanner sc=new Scanner(System.in);

    public void Binary_Search_Tree(int[] arr){
        root=GenerateTree(arr,0,arr.length-1);
    }
    public TreeNode GenerateTree(int[] arr,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode();
        root.val=arr[mid];
        root.left=GenerateTree(arr, lo, mid-1);
        root.right=GenerateTree(arr, mid+1, hi);
        return root;

    }
    public void preorder(){
        pre(root);
    }
    private void pre(TreeNode root){
       if(root==null){
        return ;
       }
       System.out.print(root.val+" ");
       pre(root.left);
       pre(root.right);
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
         if(node.val>item)
          return find(node.left,item);
         else
         return find(node.right, item);
   
       }
       public TreeNode delete(int key){

        return del(root,key);
       }
       public TreeNode del(TreeNode root,int key){

        if(root==null){
          return null;
        }
        if(root.val>key){
          root.left=del(root.left,key);
        }else if(root.val<key){
          root.right=del(root.right, key);

        }else{
          if(root.left!=null&&root.right!=null){

            int lmax=max(root.left);
            root.val=lmax;
            root.left=del(root.left,lmax);

          }else if(root.left!=null){
            return root.left;
          }else if(root.right!=null){
            return root.right;
          }else{
            return null;
          }
        }
        return root;

       }
}