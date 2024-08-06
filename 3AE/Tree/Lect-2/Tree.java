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
    public void Display(Node node){
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

}