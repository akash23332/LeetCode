class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] feq1=new int[26];
        int[] feq2=new int[26];
        for(int i=0;i<s.length();i++){
            feq1[s.charAt(i)-'a']++;
            feq2[t.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(feq1[i]!=feq2[i]){
                return false;
            }
        }
        return true;
        
    }
}