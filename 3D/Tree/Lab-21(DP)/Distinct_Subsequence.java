public class Distinct_Subsequence {
    
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        System.out.println(sub(s, t, 0, 0));
        
    }
    public static int  sub(String s,String t,int i,int j){

        if(t.length()==j){
            return 1;
        }
        if(s.length()==i){
            return 0;
        }


        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=sub(s, t, i+1, j+1);
        }
        exc=sub(s, t, i+1, j);
        return exc+inc;
    }
}
