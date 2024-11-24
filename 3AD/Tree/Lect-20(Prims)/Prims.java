import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class Prims{
    
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Prims(int v){
          map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){

        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }

    class PrimsPair{
        int vtx;
        int Acqvtx;
        int cost;

        public PrimsPair(int vtx,int Acqvtx,int cost){
            this.vtx=vtx;
            this.Acqvtx=Acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return this.vtx+"->"+this.Acqvtx+"@ "+this.cost;
        }
    }
    public void PrimsAlgo(int src){

        HashSet<Integer> visited=new HashSet<>();
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<PrimsPair>() {

            public int compare(PrimsPair o1,PrimsPair o2){
                return o1.cost-o2.cost;
            }
            
        });
        int ans=0;
        pq.add(new PrimsPair(src, src, 0));
        while(!pq.isEmpty()){
            PrimsPair rp=pq.poll();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            ans+=rp.cost;
            System.out.println(rp);

            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    pq.add(new PrimsPair(nbrs,rp.vtx, map.get(rp.vtx).get(nbrs)));
                }
            }
        }
        System.out.println(ans);


    }
    public static void main(String[] args) {
        Prims pr=new Prims(7);
        pr.addEdge(1, 2, 2);
        pr.addEdge(1, 4, 1);
        pr.addEdge(2, 3, 3);
        pr.addEdge(3, 4, 2);
        pr.addEdge(4, 5, 4);
        pr.addEdge(5, 6, 5);
        pr.addEdge(5, 7, 2);
        pr.addEdge(6, 7, 6);

        pr.PrimsAlgo(3);
        

    }
}