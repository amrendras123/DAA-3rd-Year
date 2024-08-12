public class TreeClient {
    
    public static void main(String[] args) {
        
        Tree bt=new Tree();
        bt.BinartTree();
        //10 true 20 false true 30 false false true 40 false false
        bt.Display();
        System.out.println(bt.find(50));
        System.out.println(bt.max());
        // bt.preOrder();
        // bt.inOrder();
        bt.levelOrder();
    }
}
