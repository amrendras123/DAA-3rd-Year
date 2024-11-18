import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class Dijkstra{


    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Dijkstra(int v){
          map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){

        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }
    class DijPair{
        int vtx;
        String path;
        int cost;

        public DijPair(int vtx,String path,int cost){
            this.vtx=vtx;
            this.path=path;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return this.vtx+"->"+this.path+"@"+this.cost;
        }
    }
    public void DijkstraAlgo(int src){

        HashSet<Integer> visited=new HashSet<>();
        PriorityQueue<DijPair> pq=new PriorityQueue<>(new Comparator<DijPair>() {

            public int compare(DijPair o1,DijPair o2){
                return o1.cost-o2.cost;
            }
            
        });

        pq.add(new DijPair(src, ""+src, 0));
        while(!pq.isEmpty()){
            DijPair rp=pq.poll();

            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for(int nbrs:map.get(rp.vtx).keySet()){

                if(!visited.contains(nbrs)){
                    pq.add(new DijPair(nbrs, rp.path+nbrs, rp.cost+map.get(rp.vtx).get(nbrs)));
                }

            }

        }
    

    }
    public static void main(String[] args) {
        Dijkstra dj=new Dijkstra(7);
        dj.addEdge(1, 4, 1);
        dj.addEdge(1, 2, 4);
        dj.addEdge(2, 3, 3);
        dj.addEdge(3, 4, 2);
        dj.addEdge(4, 5, 5);
        dj.addEdge(5, 6, 3);
        dj.addEdge(5, 7, 8);
        dj.addEdge(6, 7, 6);

        dj.DijkstraAlgo(1);
        

    }
}