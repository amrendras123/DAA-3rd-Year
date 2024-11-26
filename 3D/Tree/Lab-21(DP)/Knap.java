public class Knap {
    
    public static void main(String[] args) {
        int []wt={1,2,3,2,2};
        int[] val={8,4,0,5,3};
        int weight=4;
        System.out.println(knap(wt, val, weight, 0));
        
    }
    public static int knap(int[] wt,int[] val,int weight,int i){

      
      if(i==wt.length||i==val.length){
        return 0;
      }
        int inc=0;
        int exc=0;
        if(weight>=wt[i]){
            inc=val[i]+knap(wt, val, weight-wt[i], i+1);
        }
        exc=knap(wt, val, weight, i+1);

        return Math.max(inc, exc);
    }
}
