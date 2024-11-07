import java.util.HashMap;

class Graph{

    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Graph(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
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

        map.get(v1).remove(v2);
        map.get(v2).remove(v1);

    }
    public void removeVertex(int v){

        for(int nbrs:map.get(v).keySet()){
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }
    public void Display(){

        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
    

}