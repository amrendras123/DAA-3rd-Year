/**
 * ValidAnagram
 */
public class ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {
           
           if(s.length()!=t.length()){
            return false;
           }
           int[] arr1=new int[26];
           for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr1[idx]++;
           }
            int[] arr2=new int[26];
           for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int idx=ch-'a';
            arr2[idx]++;
           }
           for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
            
           }
           return true;
        }
    }
}