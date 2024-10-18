import java.util.HashMap;
import java.util.Scanner;

/**
 * same_Difference_CF
 */
public class same_Difference_CF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0){
           int ar_size=sc.nextInt();

            int[] arr=new int[ar_size];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
              
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            long count=0;
            for(int i=0;i<arr.length;i++){
                     
                int num=arr[i]-i;
                if(map.containsKey(num)){
                    count+=map.get(num);
                    map.put(num, map.get(num)+1);
                }else{
                    map.put(num, 1);
                }
            }
            System.out.println(count);


        }
    }
}