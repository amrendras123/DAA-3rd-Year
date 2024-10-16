import java.util.HashMap;
import java.util.PriorityQueue;

public class CharacterWithMaxFrequency {
    class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char c:s.toCharArray()){
            
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        maxHeap.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        
        while(!maxHeap.isEmpty()){
            char curr=maxHeap.remove();
            
            for(int i=0;i<map.get(curr);i++){
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}
}
