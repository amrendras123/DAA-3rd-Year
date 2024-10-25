import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsvaliTree {
    public static void main(String[] args) {
        int[][] edges={{0,1},{0,2},{0,3},{1,4},{2,4}};
        System.out.println(validTree(5,edges));
    }
        public static boolean validTree(int n, int[][] edges) {
            // write your code here
            HashMap<Integer,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<edges.length;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }
            return BFT(map);      
        }
        public static  boolean BFT(HashMap<Integer,List<Integer>> map){
         int cnt=0;
         HashSet<Integer> visited=new HashSet<>();
         Queue<Integer> q=new LinkedList<>();
         for(int src:map.keySet()){ 
            if(visited.contains(src)){
                continue;
            }
               q.add(src);
               cnt++;
            while(!q.isEmpty()){
                //remove
                int rv=q.poll();
                if(visited.contains(rv)){
                    return false;
                }
                //visited
                visited.add(rv);
                //nbrs
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            } 
        }
        return cnt==1;
        }
    
}