public class BSTClient {
    
    public static void main(String[] args) {
        int[] arr={5,10,15,20,30,40,45,50,55,60,65,70,90};
        BSTConstruct bst=new BSTConstruct();
        bst.Binary_Search_Tree(arr);
        bst.preOrder();
        System.out.println();
        System.out.println(bst.find(65));
        System.out.println(bst.max());

    }
}
