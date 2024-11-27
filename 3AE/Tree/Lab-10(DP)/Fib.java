class Fib{
    public static void main(String[] args) {
        int n=50;
        int[] dp=new int[n+1];
        System.out.println(fibTD(n, dp));
        System.out.println(fib(n));
        
    }
    public static int fib(int n){
   if(n==0||n==1){
            return n;
        }
        int fibn1=fib(n-1);
        int fibn2=fib(n-2);
        return fibn1+fibn2;
    }
    public static int fibTD(int n,int[] dp){
        if(n==0||n==1){
                 return n;
             }
             if(dp[n]!=0){
                return dp[n];
             }
             int fibn1=fibTD(n-1,dp);
             int fibn2=fibTD(n-2,dp);
             return dp[n]=fibn1+fibn2;
         }
}