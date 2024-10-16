import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"B");
        map.put(3, "C");
        map.put(1, "A");
        map.put(4, "D");
        map.put(5, "E");
        map.put(36, "F");
        map.put(7, "G");
        map.put(8, "H");
        map.put(9, "I");
        map.put(10, "J");
        map.put(11, "K");
        map.put(1, "ABC");
        System.out.println(map);
        System.out.println(map.get(36));
        System.out.println(map.containsKey(5));

        //******************************************************************** */

        // TreeMap<Integer,String> map=new TreeMap<>();
        // map.put(2,"B");
        // map.put(3, "C");
        // map.put(1, "A");
        // map.put(4, "D");
        // map.put(5, "E");
        // map.put(36, "F");
        // map.put(7, "G");
        // map.put(8, "H");
        // map.put(9, "I");
        // map.put(10, "J");
        // map.put(11, "K");
        // System.out.println(map);
        // System.out.println(map.get(36));
        // System.out.println(map.containsKey(5));

        //****************************************************** */
        // LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        // map.put(2,"B");
        // map.put(3, "C");
        // map.put(1, "A");
        // map.put(4, "D");
        // map.put(5, "E");
        // map.put(36, "F");
        // map.put(7, "G");
        // map.put(8, "H");
        // map.put(9, "I");
        // map.put(10, "J");
        // map.put(11, "K");
        // System.out.println(map);
        // System.out.println(map.get(36));
        // System.out.println(map.containsKey(5));

    }
}