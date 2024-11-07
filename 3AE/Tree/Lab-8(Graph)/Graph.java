import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        map.get(v2).put(v1,cost);
    }
    public boolean containsEdge(int v1,int v2){
      return map.get(v1).containsKey(v2);

    }
    public boolean containsVertex(int v){
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
    public void removeVertex(int v){
      if(containsVertex(v)){
        for(int key:map.get(v).keySet()){
            map.get(key).remove(v);
        }
        map.remove(v);
    }
    }
    public void Display(){

        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
    public boolean hasPath(int src,int dest,HashSet<Integer> visited){
        if(src==dest){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
           if(!visited.contains(nbrs)){
            boolean ans=hasPath(nbrs, dest,visited);
            if(ans){
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

    public boolean BFS(int src,int dest){

        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int rv=q.poll();
            //ignore
            if(visited.contains(rv)){
                continue;
            }
            //visited
            visited.add(rv);
            //self work
            if(rv==dest){
                return true;
            }
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
    public boolean DFS(int src,int dest){
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st=new Stack<>();

        st.add(src);
        while(!st.isEmpty()){

            int rv=st.pop();
            if(visited.contains(rv))
            continue;

            visited.add(rv);
            if(rv==dest){
                return true;
            }
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }

        }
       
    }
    return false;

    }
    public void BFT(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int rv=q.poll();
            //ignore
            if(visited.contains(rv)){
                continue;
            }
            //visited
            visited.add(rv);
            //self work
            System.out.print(rv+"->");
           
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        System.out.println();
    }
        
    }
    public void DFT(){

        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st=new Stack<>();
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }

        st.add(src);
        while(!st.isEmpty()){

            int rv=st.pop();
            if(visited.contains(rv))
            continue;

            visited.add(rv);
          System.out.print(rv+" ->");
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
        }
    }
    System.out.println();
       
    }
}
    public boolean validTree(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int cnt=0;
        for(int src:map.keySet()){
            if(visited.contains(src)){
                continue;
            }
            cnt++;
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int rv=q.poll();
            //ignore
            if(visited.contains(rv)){
                return false;
            }
            //visited
            visited.add(rv);
            //self work
            // System.out.print(rv+"->");
           
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        // System.out.println();
    }
    return cnt==1;   
    }
    public boolean isbipartite(){

    }
    public boolean isCycle(){

    }
    public int conn_component(){
        
    }
}