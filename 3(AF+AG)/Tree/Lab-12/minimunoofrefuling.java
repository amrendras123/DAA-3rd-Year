import java.util.Collections;
import java.util.PriorityQueue;

/**
 * minimunoofrefuling
 */
public class minimunoofrefuling {

    class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
         
         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
          
         int stop=0;
         int i=0;
         while(startFuel<target){

            while(i<stations.length&&startFuel>=stations[i][0]){
                pq.add(stations[i][1]);
                
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            startFuel+=pq.poll();
            stop++;
         }
         return stop;
    }
}
}