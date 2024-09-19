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
    public void insert(int item){
        root=insert(root,item);
    }
    private TreeNode insert(TreeNode root,int item){

        if(root==null){
            TreeNode nn=new TreeNode();
            nn.val=item;
            return nn;
        }
       if(root.val>item){
            root.left=insert(root.left, item);
        }
        if(root.val<item){
            root.right=insert(root.right, item);
        }
        return balance(root);
        // return root;
    }
    public int ht(){
        return ht(root);
    }
    private int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(ht(root.left),ht(root.right))+1;
    }
    private TreeNode balance(TreeNode root){

        if(ht(root.left)-ht(root.right)>1){
            //left-left
            if(ht(root.left.left)-ht(root.left.right)>0){
                return rightRotate(root);
            }
            //left-right
            if(ht(root.left.right)-ht(root.left.left)>0){
                root.left=leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if(ht(root.right)-ht(root.left)>1){
            //right-right
            if(ht(root.right.right)-ht(root.right.left)>0){
                return leftRotate(root);
            }
            //left-right
            if(ht(root.right.left)-ht(root.right.right)>0){
                root.right=rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;

    }
    public TreeNode leftRotate(TreeNode root){

        TreeNode c=root.right;
        TreeNode t=c.left;

        c.left=root;
        root.right=t;
        return c;


    }
    public TreeNode rightRotate(TreeNode root){
        TreeNode c=root.left;
        TreeNode t=c.right;

        c.right=root;
        root.left=t;

        return c;
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