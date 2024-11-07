import java.util.Comparator;
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
        PriorityQueue<DijPair> pq=new PriorityQueue<>(new Comparator<DijPair>() {
            public int compare(DijPair o1,DijPair o2){
                return o1.cost-o2.cost;
            }
        });
        pq.add(new DijPair(src, ""+src, 0));
        while(!pq.isEmpty()){
            //remove
            DijPair rp=pq.poll();
            //ignore
           if(visisted.contains(rp.vtx)){
            continue;
           }
            //visited
            visisted.add(rp.vtx);
            //self work
            System.out.println(rp);
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
        @Override
        public String toString(){
            return this.vtx+"->"+this.path+"@"+this.cost;
        }
    }
    public static void main(String[] args) {
        Dijkstra gr=new Dijkstra(7);
        gr.addEdge(1, 2, 3);
        gr.addEdge(1, 4, 2);
        gr.addEdge(2, 3, 4);
        gr.addEdge(3, 4, 10);
        gr.addEdge(4, 5, 5);
        gr.addEdge(5, 6, 9);
        gr.addEdge(5, 7, 12);
        gr.addEdge(6, 7, 6);

        gr.dijkstra(1);
    }
}