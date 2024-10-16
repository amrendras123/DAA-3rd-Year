import java.util.HashMap;
import java.util.List;

public class BrickWall {
    class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(List<Integer> list:wall){
            
            int sum=0;
            for(int i=0;i<list.size()-1;i++){
                
                sum+=list.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);
                ans=Math.max(ans,map.get(sum));
            }
        }
        return wall.size()-ans;
    }
}
}
