import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        // Map<String,Integer> map1=new HashMap<>();

        HashMap<String,Integer> map=new HashMap<>();
        map.put("A", 88);
        map.put("B", 90);
        map.put("c", 0);
        map.put("AB", 881);
        map.put("BA", 900);
        map.put("c", 10);
        map.put(null, 0);
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("D"));
        System.out.println(map.get("A"));
        System.out.println(map.get("AC"));
        System.out.println(map);


 
        for(String K:map){
            System.out.println(K+" ="+map.get(K));

        }
        
System.out.println("***************************************************");
        TreeMap<String,Integer> map1=new TreeMap<>();
        map1.put("Amit", 88);
        map1.put("Ankit", 90);
        map1.put("Aditya", 0);
        map1.put("Suraj", 881);
        map1.put("Pankaj", 900);
        map1.put("Dhiraj", 10);
        // map1.put(null, 0);
        System.out.println(map1.containsKey("A"));
        System.out.println(map1.containsKey("D"));
        System.out.println(map1.get("A"));
        System.out.println(map1.get("AC"));
        System.out.println(map1);

        System.out.println("**************************************************");
        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();
        map2.put("Amit", 88);
        map2.put("Ankit", 90);
        map2.put("Aditya", 0);
        map2.put("Suraj", 881);
        map2.put("Pankaj", 900);
        map2.put("Dhiraj", 10);
        // map1.put(null, 0);
        System.out.println(map2.containsKey("Amit"));
        // System.out.println(map1.containsKey("D"));
        // System.out.println(map1.get("A"));
        // System.out.println(map1.get("AC"));
        System.out.println(map2);




    }
}