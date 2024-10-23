import java.util.HashMap;
import java.util.HashSet;

/**
 * Graph
 */
public class Graph {

    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph(int v){
          map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){

        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }
    public boolean containsEdge(int v1,int v2){
       
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v){
        return map.containsKey(v);
    }
    public int noOfEdge(){

        int edge=0;
        for(int key:map.keySet()){
            edge+=map.get(key).size();
        }
        return edge/2;
    }
    public void removeEdge(int v1,int v2){

        if(containsEdge(v1, v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v1){
    if(ContainsVertex(v1)){
        for(int nbrs:map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    }
    public void Display(){

        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
    // public boolean haspath(int src,int des){
    //     return haspath(src, des, new HashSet<>());
    // }
    public boolean haspath(int src,int dest,HashSet<Integer> visited){
        if(src==dest){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
            boolean ans=haspath(nbrs, dest,visited);

            if(ans==true){
                return true;
            }
        }
    }
        visited.remove(src);
        return false;
    }
    public void PrintAllPath(int src,int dest,HashSet<Integer> visited,String ans){
        if(src==dest){
            System.out.println(ans+"->"+dest);
            return ;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                PrintAllPath(nbrs, dest,visited,ans+"->"+src);
        }
    }
        visited.remove(src);
    }

}