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

    public void BinaryTree(){

        root=CreateTree();
    }
    Scanner sc=new Scanner(System.in);
    public Node CreateTree(){

        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;

        Boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=CreateTree();
        }
        Boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=CreateTree();
        }

        return nn;
    }
}