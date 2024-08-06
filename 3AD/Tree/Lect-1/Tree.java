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
}