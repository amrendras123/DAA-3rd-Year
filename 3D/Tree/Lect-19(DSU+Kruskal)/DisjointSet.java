import java.util.HashMap;

class DisJointSet{

    class Node {
    int val;
    int rank;
    Node parent;
        // Node(int val,int rank,Node parent){
        //     this.val=val;
        //     this.rank=rank;
        //     this.parent=parent;
        // };

    }
    HashMap<Integer,Node> map=new HashMap<>();
    public void CreateSet(int v){
        Node nn=new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }
}