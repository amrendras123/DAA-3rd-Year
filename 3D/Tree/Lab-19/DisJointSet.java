import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DisJointSet{
  class Node {
    int val;
    int rank;
    Node parent;

    }
    HashMap<Integer,Node> map=new HashMap<>();
    public void CreateSet(int v){
        Node nn=new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }
    //find
    public int find(int v){
        Node nn=map.get(v);
        return find(nn.parent).val;
    }
    private Node find(Node node){

        if(node==node.parent){
            return node;
        }
        Node nn=find(node.parent);
        node.parent=nn;//path compression
        return nn;

    }
    //union
    public void union(int e1,int e2){

        Node n1=map.get(e1);
        Node n2=map.get(e2);

        Node rn1=find(n1);
        Node rn2=find(n2);

        if(rn1.rank==(rn2.rank)){
                rn1.parent=rn2;
                rn2.rank++;

        }else if(rn1.rank>rn2.rank){
            rn2.parent=rn1;

        }else{
        rn1.parent=rn2;
        }
    }
    

}