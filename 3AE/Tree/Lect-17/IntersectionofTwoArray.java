import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArray {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
                map.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
}
