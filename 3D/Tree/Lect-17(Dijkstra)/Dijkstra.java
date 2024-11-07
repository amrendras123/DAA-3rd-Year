import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra {

    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Dijkstra(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void dijkstra(int src){
        HashSet<Integer> visisted=new HashSet<>();
        PriorityQueue<DijPair> pq=new PriorityQueue<>();
        pq.add(new DijPair(src, ""+src, 0));
        while(!pq.isEmpty()){
            //remove
            DijPair rp=pq.poll();
            //ignore

            //visited
            visisted.add(rp.vtx);
            //self work
            System.out.println();

            //nbrs
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visisted.contains(nbrs)){
                    pq.add(new DijPair(nbrs, rp.path+nbrs, rp.cost+map.get(rp.vtx).get(nbrs)));
                }
            }


        }
        
    }
    class DijPair{
        int vtx;
        String path;
        int cost;

        public DijPair(int vtx,String path,int cost){
            this.vtx=vtx;
            this.path=path;
            this.cost=cost;
        };
    }
}