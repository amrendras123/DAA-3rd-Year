import java.util.HashMap;

public class DSU {
    HashMap<Integer,Node> map=new HashMap<>();
    
    class Node{
        int vtx;
        int rank;
        Node parent;
        
    }
    public void creatset(int v){

        Node nn=new Node();
        nn.vtx=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);

    }
    public int find(int e1){

        Node n1=map.get(e1);
        return find(n1.parent).vtx;

    }
    private Node find(Node n){
        if(n==n.parent){
            return n;
        }
        Node nn=find(n.parent);
        n.parent=nn;//path compression 
        return nn;
        
    }
    public void union(int e1,int e2){

        Node n1=map.get(e1);
        Node n2=map.get(e2);

        Node re1=find(n1);
        Node re2=find(n2);
        if(re1.rank==re2.rank){
            re1.parent=re2;
            re2.rank++;
        }
        else if(re1.rank>re2.rank){
           re2.parent=re1;

        }else{
            re1.parent=re2;
        }

    }

}
