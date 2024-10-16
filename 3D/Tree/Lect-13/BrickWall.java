import java.util.HashMap;
import java.util.List;

/**
 * BrickWall
 */
public class BrickWall {

    class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
       HashMap<Integer,Integer> map=new HashMap<>();
        for(List<Integer> al:wall){
            int sum=0;
            for(int i=0;i<al.size()-1;i++){
               sum+=al.get(i);
               map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int ans=0;
        for(int key:map.keySet()){
             ans=Math.max(ans,map.get(key));
        } 
        return wall.size()-ans;
    }
}
}