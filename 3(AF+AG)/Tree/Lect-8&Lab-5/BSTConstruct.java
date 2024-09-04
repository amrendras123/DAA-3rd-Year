import java.util.Scanner;

import org.w3c.dom.Node;

/**
 * BSTConstruct
 */
public class BSTConstruct {

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    };
    private TreeNode root;
    public void Binary_Search_Tree(int[] arr){
        root=CreaṭeTree(arr,0,arr.length-1);
    }
    public TreeNode CreaṭeTree(int[] arr,int lo,int hi){

        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode();
        root.val=arr[mid];
        root.left=CreaṭeTree(arr, lo, mid-1);
        root.right=CreaṭeTree(arr, mid+1, hi);

        return root;
    }
     public void preOrder(){
        preOrder(root);
    }
    private void preOrder(TreeNode node){
        if(node==null){
            return;
        }

        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(TreeNode node, int item){

        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }

       if(node.val>item)
       return find(node.left, item);
        
       else
       return find(node.right, item);

    }
    public int max(){
        return max(root);
    }
    private int max(TreeNode node){
        if(node==null){
       return Integer.MIN_VALUE;
        }
        int Right=max(node.right);

        return Math.max(node.val,Right);
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
            root.right=del(root.right,key);
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