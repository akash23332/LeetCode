class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int maxLength=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                


            }
            else{
                int len=j-i;
                maxLength=Math.max(maxLength,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
                
               
                
                
            }

        }
 int len = j - i;
        maxLength = Math.max(maxLength, len);

        return maxLength;
    }
}