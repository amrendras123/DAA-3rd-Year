import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class KruskalAlgo {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public KruskalAlgo(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
     class EdgePair{
        int e1;
        int e2;
        int cost;
        EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        };
        @Override
        public String toString(){
            return this.e1+"->"+this.e2+"@ "+this.cost;
        }
    }
    public List<EdgePair> getAllEdgePair(){
        List<EdgePair> ll=new ArrayList<>();
          for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
               ll.add(new EdgePair(e1,e2,map.get(e1).get(e2)));
            }
          }
          return ll;
    }
    public void KruskalAlgorithm(){
        int ans=0;
        DSU dsu=new DSU();
        for(int vtx:map.keySet()){
            dsu.creatset(vtx);
        }
        List<EdgePair> ll=getAllEdgePair();
        Collections.sort(ll,new Comparator<EdgePair>() {
         @Override
            public int compare(EdgePair o1,EdgePair o2){
                return o1.cost-o2.cost;
            }     
        });
        for(EdgePair e:ll){
            int re1=dsu.find(e.e1);
            int re2=dsu.find(e.e2);

            if(re1==re2){

            }else{
                dsu.union(e.e1, e.e2);
                System.out.println(e);
                ans+=e.cost;
            }

        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        
        KruskalAlgo pr=new KruskalAlgo(7);
        pr.addEdge(1, 2, 3);
        pr.addEdge(1, 4, 2);
        pr.addEdge(2, 3, 4);
        pr.addEdge(3, 4, 1);
        pr.addEdge(4, 5, 8);
        pr.addEdge(5, 6, 9);
        pr.addEdge(6, 7, 6);
        pr.addEdge(5, 7, 3);
        pr.KruskalAlgorithm();
    }
}
