import java.util.HashSet;

public class Set {
    
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(16);
        set.add(8);
        System.out.println(set);
        set.add(5);
        System.out.println(set);



    }
}
