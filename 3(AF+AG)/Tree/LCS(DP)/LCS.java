class LCS{
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int[][] dp=new int[s1.length()][s2.length()];
        System.out.println(lcsTD(s1, s2, 0, 0,dp));
        System.out.println(lcsRec(s1, s2, 0, 0));
        System.out.println(lcsBU(s1, s2));

        
    }
    public static  int lcsRec(String s1,String s2,int i,int j){
        if(i>=s1.length()||j>=s2.length()){
            return 0;
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
           ans=1+lcsRec(s1, s2, i+1, j+1);
        }else{
            int a=lcsRec(s1, s2, i+1, j);
            int b=lcsRec(s1, s2, i, j+1);
            ans=Math.max(a, b);
        }
        return ans;
    }
    public static  int lcsTD(String s1,String s2,int i,int j,int[][] dp){
        if(i>=s1.length()||j>=s2.length()){
            return 0;
        }
        int ans=0;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
           ans=1+lcsTD(s1, s2, i+1, j+1,dp);//dp[i+1][j+1]
        }else{
            int a=lcsTD(s1, s2, i+1, j,dp);//dp[i+1][j]
            int b=lcsTD(s1, s2, i, j+1,dp);//dp[i][j+1]
            ans=Math.max(a, b);
        }
        return dp[i][j]=ans;
    }
    public static int lcsBU(String s1,String s2){

        int[][] dp=new int[s1.length()+1][s2.length()+1];
        int ans=0;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans=1+dp[i-1][j-1];
                 }else{
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