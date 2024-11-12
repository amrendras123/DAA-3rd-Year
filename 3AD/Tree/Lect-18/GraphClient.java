import java.util.HashSet;

public class GraphClient {
    
    public static void main(String[] args) {
        Graph gr=new Graph(7);
        gr.addEdge(1, 2, 1);
        gr.addEdge(1, 4, 2);
        gr.addEdge(2, 3, 5);
        gr.addEdge(3, 4, 3);
        gr.addEdge(4, 5, 12);
        gr.addEdge(5, 6, 11);
        // gr.addEdge(5,7 ,9);
        gr.addEdge(6, 7, 10);

    //    gr.Display();
    //    System.out.println(gr.containsEdge(1, 2));
    //    System.out.println(gr.ContainsVertex(10));
    //    System.out.println(gr.noOfEdge());
    // //    gr.removeEdge(1, 4);
    // gr.removeVertex(4);
    //    gr.Display();
    //    System.out.println(gr.haspath(1, 6,new HashSet<>()));
    //    gr.PrintAllPath(1, 6, new HashSet<Integer>() , "");
    gr.BFT();
    // System.out.println(gr.isCycle());
    System.out.println(gr.isValidTree());







    }
}
