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
        if(list.get(ci)<list.get(pi)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int pi,int ci){

        int pth=list.get(pi);
        int cth=list.get(ci);
        list.set(pi,cth);
        list.set(ci, pth);
    }
    public int remove(){
        swap(0, list.size()-1);
        int rv=list.remove(0);
        downheapify(0);
        return rv;
    }
    public void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(list.get(lci)<list.get(pi)){
            mini=lci;
        }
        if(list.get(rci)<list.get(pi)){
            mini=rci;
        }
        if(mini!=pi){
            swap(pi,mini);
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