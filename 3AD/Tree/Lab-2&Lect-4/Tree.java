import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tree{

    class Node{
        int val;
        Node left;
        Node right;
    };
    private Node root;
    Scanner sc=new Scanner(System.in);

    public void BinaryTree(){
        root=GenerateTree();
    }
    public Node GenerateTree(){

        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;

        Boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=GenerateTree();
        }
        Boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=GenerateTree();
        }

       return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node node){

        if(node==null){
            return;
        }

        String s="";
        s=s+node.val;
        s="<-"+s+"->";

        if(node.left!=null){
            s=node.left.val+s;
        }else{
            s="."+s;
        }
        if(node.right!=null){
            s=s+node.right.val;
        }else{
            s=s+".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public boolean find(int item){
        return find(root,item);

    }
    private boolean find(Node node, int item){

        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }
        boolean left=find(node.left, item);
        boolean right=find(node.right, item);

        return left||right;

    }
    public int max(){
        return max(root);
    }
    private int max(Node node){

        if(node==null){
            return Integer.MIN_VALUE;
        }

        int lmax=max(node.left);
        int rmax=max(node.right);

        return Math.max(Math.max(lmax,rmax),node.val);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){

        if(node==null){
            return ;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){

        if(node==null){
            return ;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){

        if(node==null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");

    }
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node rv=q.poll();
            System.out.print(rv.val+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }

    }
}