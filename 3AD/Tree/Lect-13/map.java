import java.util.HashMap;

/**
 * map
 */
public class map {

    public static void main(String[] args) {

        int[] arr={1,2,1,2,1,4,5,6,2,3,4,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int fre=map.get(arr[i]);
                map.put(arr[i], fre+1);
            }else
            map.put(arr[i], 1);
        }
        // System.out.println(map);
        int max=0,maxkey=0;
        for(int key:map.keySet()){
            
            if(map.get(key)>max){
                max=map.get(key);
                maxkey=key;
            }
        }
        System.out.println(maxkey+"->"+max);
        
    }
}