import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        
        // HashMap<Integer,String> map=new HashMap<>();
        // map.put(1,"A");
        // map.put(1,"B");
        // map.put(3,"C");
        // map.put(4,"D");
        // map.put(5,"E");
        // map.put(6,"F");
        // map.put(7,"G");
        // map.put(1,"H");

        // System.out.println(map.get(1));
        // System.out.println(map);

        // System.out.println(map.containsKey(10));

        //*************************************************** */
        // TreeMap<Integer,String> map1=new TreeMap<>();
        // map1.put(1,"A");
        // map1.put(1,"B");
        // map1.put(3,"C");
        // map1.put(4,"D");
        // map1.put(5,"E");
        // map1.put(6,"F");
        // map1.put(7,"G");
        // map1.put(11,"H");
        // map1.put(12,"A");
        // map1.put(13,"B");
        // map1.put(33,"C");
        // map1.put(44,"D");
        // map1.put(55,"E");
        // map1.put(66,"F");
        // map1.put(79,"G");
        // map1.put(71,"H");

        // System.out.println(map1.get(1));
        // System.out.println(map1);

        // System.out.println(map1.containsKey(10));

        //****************************************************** */

        LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
        map2.put(1,"A");
        map2.put(1,"B");
        map2.put(4,"D");
        map2.put(6,"F");
        map2.put(5,"E");
        map2.put(7,"G");
        map2.put(3,"C");
        map2.put(11,"H");
        map2.put(12,"A");
        map2.put(13,"B");
        map2.put(33,"C");
        map2.put(44,"D");
        map2.put(55,"E");
        map2.put(66,"F");
        map2.put(79,"G");
        map2.put(71,"H");

        System.out.println(map2.get(1));
        System.out.println(map2);

        System.out.println(map2.containsKey(10));



 
        
    }
}