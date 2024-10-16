import java.util.HashMap;

public class Maxfreq {
    
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,4,3,2,1,1,1,111,1};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);//1
                map.put(arr[i],freq+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
       int max=0,key1=arr[0];
        for(int key:map.keySet()){
           int val=map.get(key);
           if(val>max){
           max=Math.max(max,val);
            key1=key;
           }
        }
        System.out.println(key1+"->"+max);
        
    }
}
