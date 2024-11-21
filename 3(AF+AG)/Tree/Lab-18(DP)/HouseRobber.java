import java.sql.Array;
import java.util.Arrays;

public class HouseRobber {
    
    public static void main(String[] args) {
        int[] arr={10,2,3,7};
        int[] dp=new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr,0));
        System.out.println(RobberTD(arr, 0, dp));
    }
    public static int Robber(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        int rob=arr[i]+Robber(arr, i+2);
        int not_rob=Robber(arr, i+1);

        return Math.max(rob, not_rob);
    }
    public static int RobberTD(int[] arr,int i,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+RobberTD(arr, i+2,dp);//dp[i+2]
        int not_rob=RobberTD(arr, i+1,dp);//dp[i+1]

        return dp[i]=Math.max(rob, not_rob);//dp[i]
    }
}