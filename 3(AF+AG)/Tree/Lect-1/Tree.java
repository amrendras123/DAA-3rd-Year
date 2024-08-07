import java.util.Scanner;

/**
 * Tree
 */
public class Tree {

    class Node {
        int val;
        Node left;
        Node right;
    };
    private Node root;


    public void BinaryTree(){
        root=CreaṭeTree();
    }
    Scanner sc=new Scanner(System.in);
    public Node CreaṭeTree(){

        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;

        Boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=CreaṭeTree();
        }
        Boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=CreaṭeTree();
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

    private Boolean find(Node node,int item){

        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }
        Boolean Leftans=find(node.left, item);
        Boolean Rightans=find(node.right, item);

        return Leftans||Rightans;

    }
    
}