/**
 * HashMap
 */
public class HashMap {

    public class Node{
        String key;
        Integer value;
        Node next;
    };
   private Node[] buket;
   private int size;

    public HashMap(int n){
        buket=new Node[n];
    }
    public HashMap(){
        buket=new Node[4];
    }
    public int hasFunc(String key){
        int idx=key.hashCode()%buket.length;
        if(idx<0){
            idx+=buket.length;
        }
        return idx;
        }
    public void put(String key,Integer value){
        int bn=hasFunc(key);
        Node temp=buket[bn];
        while(temp!=null){

            if(temp.key.equals(key)){
                temp.value=value;
                return ;
            }
            temp=temp.next;
        }
        Node nn=new Node();
        nn.value=value;
        nn.key=key;
        nn.next=buket[bn];
        buket[bn]=nn;
        size++;
    }
    public Integer get(String key){
        int bn=hasFunc(key);
        Node temp=buket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public Boolean containKey(String key){
        int bn=hasFunc(key);
        Node temp=buket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){  
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}