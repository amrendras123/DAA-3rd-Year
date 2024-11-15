import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFord {
    
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public BellmanFord(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        
    }
    
    public void BellmanFordAlgo(int src){
        int v=map.size();
        int[] arr=new int[v+1];
        for(int i=1;i<arr.length;i++){
             arr[i]=10000_000;
        }
        arr[src]=0;
        //realx
        for(int i=1;i<=v;i++){
        List<EdgePair> ll=getAllEdgePair();
        for(EdgePair e:ll){ 
            int oldcost=arr[e.e2];
            int newcost=arr[e.e1]+e.cost;
            if(i==v&&oldcost>newcost){
                System.out.println("-ve edge ka cycle hai");
                return;
            }
            if(newcost<oldcost){
                arr[e.e2]=arr[e.e1]+e.cost;
            }
        }  
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
    public static void main(String[] args) {
        BellmanFord bf=new BellmanFord(5);
        bf.addEdge(1, 2, 8);
        bf.addEdge(1, 3, 4);
        bf.addEdge(1, 4, 5);
        bf.addEdge(2, 5, 2);
        bf.addEdge(5, 2, 1);
        bf.addEdge(3, 4, -3);
        bf.addEdge(4, 5, 4);

        bf.BellmanFordAlgo(3);
        

    }
}
