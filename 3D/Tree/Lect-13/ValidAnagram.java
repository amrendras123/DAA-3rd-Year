public class ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            int[] s1=new int[26];
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int idx=ch-'a';
                s1[idx]++;
            }
             int[] s2=new int[26];
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                int idx=ch-'a';
                s2[idx]++;
            }
            for(int i=0;i<s1.length;i++){
                if(s1[i]!=s2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
