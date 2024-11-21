class Fib{

    public static void main(String[] args) {
       
        int n=30;
        int[] ar=new int[n+1];
        System.out.println(fibTD(n, ar));
        // System.out.println(fibRec(n));
        System.out.println(fibBU(n));
        System.out.println();
        
        

        
    }
    public static int fibRec(int n){
        if(n==1||n==0){
            return n;
        }
        int fib1=fibRec(n-1);
        int fib2=fibRec(n-2);
        return fib1+fib2;
    }
    public static int fibTD(int n,int[] dp){
        if(n==1||n==0){
            return n;
        }
        if(dp[n]!=0){//dp  steps
            return dp[n];
        }
        int fib1=fibTD(n-1,dp);//dp[n-1]
        int fib2=fibTD(n-2,dp);//dp[n-2]
        return dp[n]=fib1+fib2;//memoiztion dp[n]
    }
    public static int fibBU(int n){

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
    for(int i=2;i<=n;i++){
        int fib1=dp[i-1];
        int fib2=dp[i-2];
        dp[i]=fib1+fib2;
    }
    return dp[n];
    }

}