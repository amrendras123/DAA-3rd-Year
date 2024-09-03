public class BSTClient {
    
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,100};
        BSTConstruct bst=new BSTConstruct();
        bst.BinarySearchTree(arr);
        bst.preOrder();
        System.out.println();
        System.out.println(bst.max());
        System.out.println(bst.find(150));
    }
}
