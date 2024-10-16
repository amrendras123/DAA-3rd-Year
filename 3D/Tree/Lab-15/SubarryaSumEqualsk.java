import java.util.HashMap;

/**
 * SubarryaSumEqualsk
 */
public class SubarryaSumEqualsk {

    class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k); 
              }
              map.put(sum,map.getOrDefault(sum,0)+1);
            //   if(map.containsKey(sum)){
            //     int freq=map.get(sum);
            //     map.put(sum,frq+1);
            //   }else{
            //     map.put(sum,1);
            //   }
        }
        return cnt;
    }
}
}