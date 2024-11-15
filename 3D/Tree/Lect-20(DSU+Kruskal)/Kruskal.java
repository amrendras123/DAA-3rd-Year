import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Kruskal {

    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Kruskal(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

class Pair{
        int e1;
        int e2;
        int cost;
        public Pair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.e1+"-"+this.e2+"->"+this.cost;
        }
    }
    public List<Pair> getAllEdge(){

        List<Pair> ll=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost=map.get(e1).get(e2);
                ll.add(new Pair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void kruskalAlgo(){

        List<Pair> ll=getAllEdge();
        Collections.sort(ll,new Comparator<T>() {
            
        });

        



    }
    
  
}
