public class BT_From_PreOrder_Inorder {
    
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
           public TreeNode buildTree(int[] preorder, int[] inorder) {
               
             return construct(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
       
           }
           public TreeNode construct(int[] preorder, int[] inorder,int ps,int pe,int is,int ie){
             
             if(ps>pe||is>ie){
               return null;
             }
               
               TreeNode root=new TreeNode(preorder[ps]);
               int idx=search(inorder,is,ie,preorder[ps]);
               int nel=idx-is;
       
               root.left=construct(preorder,inorder,ps+1,ps+nel,is,idx-1);
               root.right=construct(preorder,inorder,ps+nel+1,pe,idx+1,ie);
       
               return root;
           }
           public int search(int[] arr,int si,int ei,int item){
                 
                 for(int i=si;i<=ei;i++){
                   if(arr[i]==item){
                       return i;
                   }
                 }
                 return 0;
           }
       
       }
}
