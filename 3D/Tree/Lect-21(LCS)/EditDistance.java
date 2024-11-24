import java.util.Arrays;

public class EditDistance {
    
    public static void main(String[] args) {
        String s1="food";
        String s2="money";
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
       System.out.println(EditTD(s1, s2, 0, 0,dp));
       System.out.println(EditBU(s1, s2));
        
    }
    public static int Edit(String s1,String s2,int i,int j){

        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=Edit(s1,s2,i+1,j+1);
        }else{
            int I=Edit(s1, s2, i, j+1);
            int D=Edit(s1, s2, i+1, j);
            int R=Edit(s1, s2, i+1, j+1);
            ans=Math.min(I,Math.min(D,R))+1;
        }

        return ans;

    }
    public static int EditTD(String s1,String s2,int i,int j,int[][] dp){

        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        int ans=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            ans=EditTD(s1,s2,i+1,j+1,dp);//dp[i+1][j+1]
        }else{
            int I=EditTD(s1, s2, i, j+1,dp);///dp[i][j+1]
            int D=EditTD(s1, s2, i+1, j,dp);//dp[i+1][j]
            int R=EditTD(s1, s2, i+1, j+1,dp);//dp[i+1][j+1]
            ans=Math.min(I,Math.min(D,R))+1;
        }

        return dp[i][j]=ans;

    }
    public static int EditBU( String s1,String s2){

        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
      int ans;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans=dp[i-1][j-1];
                }else{
                    int I=dp[i][j-1];
                    int D=dp[i-1][j];
                    int R=dp[i-1][j-1];
                    ans=Math.min(I,Math.min(D,R))+1;
                }

                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
