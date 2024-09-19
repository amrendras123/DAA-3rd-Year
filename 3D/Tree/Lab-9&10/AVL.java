/**
 * BSTConstruct
 */
public class AVL {

   
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
    public TreeNode insert(TreeNode root,int val){

        if(root==null){
           TreeNode nn=new TreeNode();
           nn.val=val;
           return nn;
        }
        if(root.val<val){
            root.right=insert(root.right, val);
        }
        if(root.val>val){
            root.left=insert(root.left, val);
        }

        return Rotate(root);
    }
    public int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(ht(root.left),ht(root.right))+1;
    }
    private TreeNode Rotate(TreeNode root){
         //left-left ||left-right
        if(ht(root.left)-ht(root.right)>1){
            //left-left
            if(ht(root.left.left)-ht(root.left.right)>0){
               return RightRotate(root);
            }
            //left-right
            if(ht(root.left.right)-ht(root.left.left)>0){
                root.left=LeftRotate(root.left);
               return  RightRotate(root);
            }

        }
        if(ht(root.right)-ht(root.left)>1){
            //right -right
            if(ht(root.right.right)-ht(root.right.left)>0){
               return RightRotate(root);
            }
            //left-right
            if(ht(root.left.right)-ht(root.left.left)>0){
                root.left=LeftRotate(root.left);
               return  RightRotate(root);
            }

        }


        

        }


    }
    public TreeNode insert(TreeNode root,int key){

        if(root==null){
            TreeNode node=new TreeNode();
            node.val=key;
            return root;
        }
        if(root.val<key){
            return insert(root.right, key);
        }else if(root.val>key){
            return insert(root.left, key);
        }
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
             return  find(node.left, item);
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
    public TreeNode delete(int item){

        return del(root,item);
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