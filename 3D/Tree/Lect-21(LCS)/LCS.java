import java.util.Arrays;

class LCS{
    public static void main(String[] args) {
        String s1="abcdecchwddccdcdcdcscdscscscscscwd";
        String s2="ace";
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }

        // System.out.println(lcs(s1, s2, 0, 0));
        System.out.println(lcsTD(s1, s2, 0, 0,dp));
        System.out.println(LCSBU(s1, s2));
    }
    public static int lcsTD(String s1,String s2,int i,int j,int[][] dp){
        if(s1.length()==i||s2.length()==j)
        return 0;
        int ans=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
        ans=1+lcsTD(s1, s2, i+1, j+1,dp);
        }
        else{
            int a=lcsTD(s1, s2, i+1, j,dp);
            int b=lcsTD(s1, s2, i, j+1,dp);
            ans=Math.max(a, b);
        }
        return dp[i][j]=ans;
    }
    public static int lcs(String s1,String s2,int i,int j){
        if(s1.length()==i||s2.length()==j)
        return 0;
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
        ans=1+lcs(s1, s2, i+1, j+1);//dp[i+1][j+1]
        }
        else{
            int a=lcs(s1, s2, i+1, j);//dp[i+1][j]
            int b=lcs(s1, s2, i, j+1);//dp[i][j+1]
            ans=Math.max(a, b);
        }
        return ans;
    }
    public  static int LCSBU(String s1,String s2){
      int[][] dp=new int[s1.length()+1][s2.length()+1];
      int ans=0;
      for(int i=1;i<dp.length;i++){
        for(int j=1;j<dp[0].length;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans=1+dp[i-1][j-1];
                }
                else{
                    int a=dp[i-1][j];
                    int b=dp[i][j-1];
                    ans=Math.max(a, b);
                }
                dp[i][j]=ans;
        }
      }
      return dp[dp.length-1][dp[0].length-1];

    }
    
}