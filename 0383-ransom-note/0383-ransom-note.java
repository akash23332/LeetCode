class Solution {
    public boolean canConstruct(String a, String b) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<a.length();i++){
            freq1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            freq2[b.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                return false;
                
               
            }
            
        }
        return true;
        
    }
}