import java.util.HashMap;

public class noofSubarrayEqualsnumberof0sand1s {

class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0, res = 0;
        for (int i = 0; i<n; i++){
            if(arr[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                res = Math.max(res,i-idx);
            }else{
                map.put(sum,i);
            }
        }
        return res;
    }
}
}
