import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {

    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Prims(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    
    class PrimsPair{
        int vtx;
        int Acqvtx;
        int cost;

        PrimsPair(int vtx,int Acqvtx,int cost){

            this.vtx=vtx;
            this.Acqvtx=Acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return this.vtx+"->"+this.Acqvtx+"@"+this.cost;
        }
    }
    public void primsAlgo(){
        HashSet<Integer> visited=new HashSet<>();
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<PrimsPair>() {

            public int compare(PrimsPair o1,PrimsPair o2){
                return o1.cost-o2.cost;
            }
            
        });
        pq.add(new PrimsPair(7, 7, 0));
       int ans=0;
        while(!pq.isEmpty()){
            PrimsPair rp=pq.poll();

            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            ans+=rp.cost;
            //self work
            System.out.println(rp);
            for(int nbrs:map.get(rp.vtx).keySet()){

                if(!visited.contains(nbrs)){
                    pq.add(new PrimsPair(nbrs, rp.vtx, map.get(rp.vtx).get(nbrs)));
                }

            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Prims ks=new Prims(7);
        ks.addEdge(1, 2, 1);
        ks.addEdge(1, 4, 2);
        ks.addEdge(2, 3, 4);
        ks.addEdge(3, 4, 9);
        ks.addEdge(4, 5, 6);
        ks.addEdge(5, 7, 2);
        ks.addEdge(5, 6, 5);
        ks.addEdge(6, 7, 3);
        ks.primsAlgo();
    }

}
