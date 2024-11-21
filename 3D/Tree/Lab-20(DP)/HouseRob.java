import java.util.Arrays;

public class HouseRob {
    
   public static void main(String[] args) {
    int[] arr={3,1,4,7};
    int[] dp=new int[arr.length];
    Arrays.fill(dp, -1);
    System.out.println(RobTD(arr, 0, dp));
    System.out.println(RobRec(arr, 0));
    System.out.println(RobBU(arr));
    
   }
   public static int RobRec(int[] arr,int i){
   if(i>=arr.length){
    return 0;
   }
    int rob=arr[i]+RobRec(arr,i+2);
    int no_rob=RobRec(arr,i+1);
    return Math.max(rob, no_rob);
   }
   public static int RobTD(int[] arr,int i,int[] dp){
    if(i>=arr.length){
     return 0;
    }
     if(dp[i]!=-1){
        return dp[i];
     }
     int rob=arr[i]+RobTD(arr,i+2,dp);//dp[i+2]
     int no_rob=RobTD(arr,i+1,dp);//dp[i+1]
     return dp[i]=Math.max(rob, no_rob);//dp[i]
    }
    public static int RobBU(int[]arr){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],arr[0]);

        for(int i=2;i<arr.length;i++){
            int rob=arr[i]+dp[i-2];
           int no_rob=dp[i-1];
           dp[i]=Math.max(rob, no_rob);//dp[i]
        }
        return (dp[arr.length-1]);


    }
}
