class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> s1map=new HashMap<>();
        HashMap<Character,Integer> s2map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            s1map.put(ch,s1map.getOrDefault(ch,0)+1);

        }
        int len=s1.length();
        int i=0;
        int j=0;
        boolean flag =false;
        while(j<s2.length()){
            char ch=s2.charAt(j);
            s2map.put(ch,s2map.getOrDefault(ch,0)+1);
            if(j-i+1==len){
                if(s1map.equals(s2map)){
                    flag=true;
                }
                char left=s2.charAt(i);
                s2map.put(left,s2map.get(left)-1);
                if(s2map.get(left)==0){
                    s2map.remove(left);
                }
                i++;
            }
            j++;
        }
        return flag;
    }
}