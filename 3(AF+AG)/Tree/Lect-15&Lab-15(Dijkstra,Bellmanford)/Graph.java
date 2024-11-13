import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public boolean hasPath(int src,int dest,HashSet<Integer> visited){
        if(src==dest){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
            boolean ans=hasPath(nbrs, dest,visited);
            if(ans==true){
                return true;
            }
        }
    }
        return false;

    }
    public void PrintAllPath(int src,int dest,String ans,HashSet<Integer> visited){
        if(src==dest){
            System.out.println(ans+dest);
            return ;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
            PrintAllPath(nbrs, dest,ans+src+"->",visited);
        }
    }
    visited.remove(src);
    }

    public boolean BFS(int src,int dest){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            //remove
            int rv=q.poll();
            ////ignore
            if(visited.contains(rv)){
                continue;
            }
            //visited
            visited.add(rv);
            //self work
            if(rv==dest){
                return true;
            }
            //nbrs
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
        while (!st.isEmpty()) {
            //remove
            int rv=st.pop();
            ////ignore
            if(visited.contains(rv)){
                continue;
            }
            //visited
            visited.add(rv);
            //self work
            if(rv==dest){
                return true;
            }
            //nbrs
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.add(nbrs);
                }
            }  
        }
        return false;
    }
  
    public void BFT(){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int src:map.keySet()){
            if(!visited.contains(src))
               q.add(src);
            while (!q.isEmpty()) {
                //remove
                int rv=q.poll();
                ////ignore
                if(visited.contains(rv)){
                    continue;
                }
                //visited
                visited.add(rv);
              //self work 
              System.out.print(rv+"->");
                //nbrs
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }  
            }
            
        }
    }
    public void DFT(){

    }
    public int noOfConnectedComponenet(){
        int cmp=0;
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int src:map.keySet()){
            if(!visited.contains(src))
               q.add(src);
               cmp++;
            while (!q.isEmpty()) {
                //remove
                int rv=q.poll();
                ////ignore
                if(visited.contains(rv)){
                    continue;
                }
                //visited
                visited.add(rv);
              //self work 
              System.out.print(rv+"->");
                //nbrs
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }  
            }
            
        }
        return cmp;

    }
    public boolean isCycle(){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int src:map.keySet()){
            if(!visited.contains(src))
               q.add(src);
            while (!q.isEmpty()) {
                //remove
                int rv=q.poll();
                ////ignore
                if(visited.contains(rv)){
                    return true;
                }
                //visited
                visited.add(rv);
              //self work 
              System.out.print(rv+"->");
                //nbrs
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }  
            }
            
        }
        return false;
    }
    public boolean isvalidTree(){
        int cmp=0;
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int src:map.keySet()){
            if(!visited.contains(src))
               q.add(src);
               cmp++;
            while (!q.isEmpty()) {
                //remove
                int rv=q.poll();
                ////ignore
                if(visited.contains(rv)){
                    return false;
                }
                //visited
                visited.add(rv);
              //self work 
              System.out.print(rv+"->");
                //nbrs
                for(int nbrs:map.get(rv).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }  
            }
            
        }
        return cmp==1;
    }
    

}