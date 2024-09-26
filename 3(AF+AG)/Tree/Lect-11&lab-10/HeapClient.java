import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapClient {
    
    public static void main(String[] args) {



     PriorityQueue<Integer> mpq=new PriorityQueue<>();//minpq
     PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());//maxpq




        Heap pq=new Heap();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        // System.out.println(pq.min());
        pq.add(5);
        pq.add(-10);
        // System.out.println(pq.min());
        // System.out.println(pq.remove());
        System.out.println(pq.min());


    
        // pq.add(0);
    }
}
