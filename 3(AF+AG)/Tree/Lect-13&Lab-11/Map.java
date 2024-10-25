import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        
        // HashMap<Integer,String> map=new HashMap<>();
        // map.put(2, "B");
        // map.put(2, "C");
        // map.put(21, "BA");
        // map.put(25, "ABC");
        // map.put(5, "Sahil");
        // map.put(4, "Aditya");
        // map.put(6, "Anurag");
        // map.put(22, "Prashant");
        // map.put(12, "mukund");
        // map.put(24, "Shivam");
        
        // System.out.println(map);

        // System.out.println(map.get(5));
        // System.out.println(map.containsKey(25));
        // System.out.println(map.remove(24));
        // System.out.println(map);

        // for(int key:map.keySet()){
        //     System.out.println(key+"->"+map.get(key));
        // }

        // TreeMap<Integer,String> map=new TreeMap<>();
        // map.put(2, "B");
        // map.put(3, "C");
        // map.put(21, "BA");
        // map.put(25, "ABC");
        // map.put(5, "Sahil");
        // map.put(4, "Aditya");
        // map.put(6, "Anurag");
        // map.put(22, "Prashant");
        // map.put(12, "mukund");
        // map.put(24, "Shivam");
        
        // System.out.println(map);

        // System.out.println(map.get(5));
        // System.out.println(map.containsKey(25));
        // System.out.println(map.remove(24));
        // System.out.println(map);

        // for(int key:map.keySet()){
        //     System.out.println(key+"->"+map.get(key));
        // }

        // LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        // map.put(2, "B");
        // map.put(3, "C");
        // map.put(21, "BA");
        // map.put(25, "ABC");
        // map.put(5, "Sahil");
        // map.put(4, "Aditya");
        // map.put(6, "Anurag");
        // map.put(22, "Prashant");
        // map.put(12, "mukund");
        // map.put(24, "Shivam");
        
        // System.out.println(map);

        // System.out.println(map.get(5));
        // System.out.println(map.containsKey(25));
        // System.out.println(map.remove(24));
        // System.out.println(map);

        // for(int key:map.keySet()){
        //     System.out.println(key+"->"+map.get(key));
        // }

        // HashSet<Integer> set=new HashSet<>();
        // set.add(1);
        // set.contains(1);
       int[] arr={1,2,1,21,2,1,2,3,4,4,55,6,6,6,543211,1,1};
        HashMap<Integer,Integer> freMap=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            // if(freMap.containsKey(arr[i])){
            //     int fre=freMap.get(arr[i]);
            //     freMap.put(arr[i], fre+1);
            // }else{
            //     freMap.put(arr[i],1);
            // }

            freMap.put(arr[i],freMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freMap);
int maxfeq=0;
int frekey=0;
for(int key:freMap.keySet()){
            // System.out.println(key+"->"+freMap.get(key));

            if(freMap.get(key)>maxfeq){
               maxfeq=freMap.get(key);
               frekey=key;
            }
        }
        System.out.println(frekey+"->"+maxfeq);

    }
}