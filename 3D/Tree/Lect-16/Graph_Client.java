import java.util.HashSet;

public class Graph_Client {
    
    public static void main(String[] args) {
        Graph gr=new Graph(7);
        gr.addEdge(1, 2, 3);
        gr.addEdge(1, 4, 2);
        gr.addEdge(2, 3, 4);
        gr.addEdge(3, 4, 10);
        // gr.addEdge(4, 5, 5);
        gr.addEdge(5, 6, 9);
        gr.addEdge(5, 7, 12);
        gr.addEdge(6, 7, 6);

    //     gr.Display();
    //     System.out.println(gr.containsEdge(1, 6));
    //     System.out.println(gr.noOfEdge());
    //     System.out.println(gr.containsVertex(10));
    //  gr.removeVertex(4);
    //  gr.Display();
    //  System.out.println(gr.hasPath(1,6,new HashSet<>()));
    //  gr.PrintAllPath(1, 6, new HashSet<>(), "");
    //  System.out.println(gr.DFS(1, 6));
    gr.BFT();


    }
}
