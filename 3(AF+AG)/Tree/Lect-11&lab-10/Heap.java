import java.util.ArrayList;

/**
 * Heap
 */
public class Heap {

    ArrayList<Integer> list=new ArrayList<>();

    public void add(int val){
        list.add(val);
        upheapify(list.size()-1);
    }
    public void upheapify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int pi,int ci){
        int pval=list.get(pi);
        int cval=list.get(ci);
        list.set(pi,cval);
        list.set(ci,pval);
    }
    public int remove(){
        swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
         downheapify(0);
        return rv;
    }
    public void downheapify(int pi){
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
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int min(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
}