public class TreeClient {
 
    public static void main(String[] args) {
        
        Tree bt=new Tree();

        bt.BinaryTree();
        bt.Display();
        System.out.println(bt.find(10));
        bt.preorder();
        //10 true 20 true 30 false false true 50 false false true 60 false true 70 false false
    }
}
