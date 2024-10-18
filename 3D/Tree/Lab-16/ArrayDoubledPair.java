import java.util.Arrays;

class ArrayDoubledPair {
    public boolean canReorderDoubled(int[] arr) {
       
        if(arr.length==0){
            return true;
        }
         boolean count=false;
        
        Arrays.sort(arr);
       HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
            if(arr[i]<0){
                if(arr[i]%2!=0){
                    return false;
                }
                if(map.containsKey(arr[i]/2)&&map.get(arr[i]/2)>0){
                    count=true;
                    map.put(arr[i]/2,map.get(arr[i]/2)-1);
                    map.put(arr[i],map.get(arr[i])-1);
                    
                    if(map.get(arr[i]/2)==0){
                        map.remove(arr[i]/2);
                    }
                    if(map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                }else{
                    return false;
                }
            }else{
                if(map.containsKey(arr[i]*2) &&map.get(arr[i]*2)>0){
                    count=true;
                    map.put(arr[i]*2,map.get(arr[i]*2)-1);
                    map.put(arr[i],map.get(arr[i])-1);
                    
                    if(map.get(arr[i]*2)==0){
                        map.remove(arr[i]*2);
                    }
                    if(map.containsKey(arr[i])){
                    if(map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                    }
                } else{
                    return false;
                }
            }
            }
        }
        return count;
        
    }
}