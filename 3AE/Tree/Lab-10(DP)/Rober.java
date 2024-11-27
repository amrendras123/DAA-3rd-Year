import java.util.Arrays;

public class Rober {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int[] dp=new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(rob(arr, 0));
        System.out.println(robTD(arr, 0, dp));
        
    }
    public static int rob(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }

        int rob=arr[i]+rob(arr, i+2);
        int no_rob=rob(arr,i+1);

        return Math.max(rob, no_rob);
    }
    public static int robTD(int[] arr,int i,int[] dp){
        if(i>=arr.length){
            return 0;
        }
      if(dp[i]!=-1){
        return dp[i];
      }
        int rob=arr[i]+robTD(arr, i+2,dp);
        int no_rob=robTD(arr,i+1,dp);

        return dp[i]=Math.max(rob, no_rob);
    }
}
