class  Fib{

    public static void main(String[] args) {
        int n=50;
        int[] dp=new int[n+1];
        System.out.println(fibTD(n, dp));
        System.out.println(RecBU(n));
        System.out.println(fibrec(n));
        
    }
    public static int fibrec(int n){

        if(n==0||n==1){
            return n;
        }
        int fib1=fibrec(n-1);
        int fib2=fibrec(n-2);

        return fib1+fib2;
    }
    public static  int fibTD(int n,int[] dp){

        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int fib1=fibTD(n-1,dp);//dp[n-1]
        int fib2=fibTD(n-2,dp);//dp[n-2]

        return dp[n]=fib1+fib2;//dp[n]
    }
    public static int RecBU(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            int fib1=dp[i-1];
            int fib2=dp[i-2];

           dp[i]=fib1+fib2;
        }
        return dp[n];

    }
}