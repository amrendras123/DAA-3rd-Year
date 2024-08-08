import java.util.LinkedList;
import java.util.Queue;
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
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }

        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);

    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");

    }
    public void Inorder(){
        Inorder(root);
    }
    private void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.val+" ");
        Inorder(node.right);

    }
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node node){

        Queue<Node> q=new LinkedList<>();

        q.add(node);
        while (!q.isEmpty()) {

            Node rv=q.poll();
            System.out.print(rv.val+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
            
        }
        System.out.println();
        
    }
    
}