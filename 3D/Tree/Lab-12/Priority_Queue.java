import java.util.ArrayList;

/**
 * Priority_Queue
 */
public class Priority_Queue {

    ArrayList<Integer> list=new ArrayList<>();

    public void add(int val){
        
        list.add(val);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){

        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }

    public void swap(int i ,int j){
        int ith=list.get(i);
        int jth=list.get(j);

        list.set(i,jth);
        list.set(j,ith);
    }
    public int size(){
        return list.size();
    }
    public int getMin(){
        return list.get(0);
    }
    public int remove(){
        swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        downheapify(0);
        return rv;

    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;

        int mini=pi;
        if(lci<list.size()&&list.get(lci)<list.get(mini)){
            mini=lci;
        }
        if(rci<list.size()&&list.get(rci)<list.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(pi, mini);
            downheapify(mini);
        }
    }
}