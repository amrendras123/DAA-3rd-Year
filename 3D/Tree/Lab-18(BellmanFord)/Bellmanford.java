import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bellmanford {

    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Bellmanford(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
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
    public void BellmanfordAlgo(int src){
        int v=map.size();
        int[] dist=new int[v+1];
        for(int i=1;i<=v;i++){
             dist[i]=10000_000;
        }
        dist[src]=0;
        for(int i=1;i<=v;i++){
            List<Pair> ll=getAllEdge();
            for(Pair e:ll){
                if(i==v&&dist[e.e2]>dist[e.e1]+e.cost){
                    System.out.println("-ve edge ka cycle hai");
                    return ;
                }
                else if(dist[e.e2]>dist[e.e1]+e.cost){
                    dist[e.e2]=dist[e.e1]+e.cost;
                }
            }
        }
        for(int i=1;i<dist.length;i++){
            System.out.print(dist[i]+" ");
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
    public static void main(String[] args) {
        Bellmanford bf=new Bellmanford(5);
        bf.addEdge(1, 2, 8);
        bf.addEdge(1, 4, 5);
        bf.addEdge(1, 3, 4);
        bf.addEdge(2, 5, -2);
        bf.addEdge(5, 2, 1);
        bf.addEdge(4, 5, 4);
        bf.addEdge(3, 4,-3);
        bf.BellmanfordAlgo(1);


    }
   
}