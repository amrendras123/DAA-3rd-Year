import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Tree
 */
public class Tree {

    class Node{
        int val;
        Node left;
        Node right;
    };
    private Node root;

    public void BinartTree(){

        root=ConstructTree();
    }
    Scanner sc=new Scanner(System.in);
    public Node ConstructTree(){

      int item=sc.nextInt();
      Node nn=new Node();
      nn.val=item;

      Boolean hlc=sc.nextBoolean();
      if(hlc){
        nn.left=ConstructTree();
      }
      Boolean hrc=sc.nextBoolean();
      if(hrc){
        nn.right=ConstructTree();
      }
      
      return nn;

    }
    public void Display(){
      Display(root);
    }
    private void Display(Node node){
      if(node==null){
        return ;
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
     return find(root, item);
    }
    private boolean find(Node node, int item){

      if(node==null){
        return false;
      }
      if(node.val==item){
        return true;
      }
      boolean left=find(node.left,item);
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

      int left=max(node.left);
      int right=max(node.right);

      return Math.max(Math.max(left,right),node.val);
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