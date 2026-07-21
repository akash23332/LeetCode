class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans=new HashSet<>();
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++){

            while(ans.contains(s.charAt(j))){
                ans.remove(s.charAt(i));
                i++;
            }
            ans.add(s.charAt(j));
            max=Math.max(max,j-i+1);
        } 
        return max;
    }
}