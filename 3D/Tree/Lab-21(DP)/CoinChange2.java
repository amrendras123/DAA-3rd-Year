class CoinChange2{

    public static void main(String[] args) {

        int[] arr={1,2,5};
        int amt=5;
        System.out.println(coin(arr, amt, 0));
        System.out.println(BU(arr, amt));
        
    }
    public static int coin(int[] arr,int amount,int idx){
        if(amount==0){
            return 1;
        }
        if(idx==arr.length){
            return 0;
        }

        int inc=0;
        int exc=0;
        if(amount>=arr[idx]){
            inc=coin(arr, amount-arr[idx], idx);
        }
        exc=coin(arr, amount, idx+1);
        return inc+exc;
    }
    public static int BU(int[] coin,int am){
        int[][] dp=new int[coin.length+1][am+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int c=1;c<dp.length;c++){
        for(int amt=1;amt<=am;amt++){
            int inc=0;
            int exc=0;
            if(amt>=coin[c-1]){
            inc=dp[c][amt-coin[c-1]];
            }
            exc=dp[c-1][amt];
            dp[c][amt]=inc+exc;
        
    }
}
return dp[dp.length-1][dp[0].length-1];
    }
    }