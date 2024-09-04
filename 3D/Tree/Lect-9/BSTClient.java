public class BSTClient {
    
    public static void main(String[] args) {
        int[] in={10,20,30,40,50,60,70,80};
        BSTConstruct bst=new BSTConstruct();
        bst.Binary_Search_Tree(in);
       bst.pre();
       System.out.println();
       System.out.println(bst.max());
       System.out.println();
       System.out.println(bst.find(170));
    }
}
