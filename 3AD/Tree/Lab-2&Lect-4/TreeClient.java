public class TreeClient {
    public static void main(String[] args) {
        
        Tree bt=new Tree();
        bt.BinaryTree();
        bt.Display();
        System.out.println(bt.find(60));
        System.out.println(bt.max());
        //10 true 20 false false true 30 false true 40 false false
        // bt.preOrder();
        bt.levelOrder();


    }
    
}
