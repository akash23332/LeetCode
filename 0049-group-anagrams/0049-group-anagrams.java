class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean[] used=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
          
            if(used[i]){
                continue;
            }
              List<String> curr=new ArrayList<>();
              curr.add(strs[i]);
              used[i]=true;



            for(int j=0;j<strs.length;j++){
                if(used[j]){
                    continue;
                }
                String a=strs[i];
                String b=strs[j];
                if (a.length() != b.length()) {
                    continue;
                }
                HashMap<Character,Integer> map=new HashMap<>();
             
                for(int k=0;k<a.length();k++){
                    char ch=a.charAt(k);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
                for(int k=0;k<b.length();k++){
                    char ch=b.charAt(k);
                    if(!map.containsKey(ch)){
                        break;
                    }
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0){
                        map.remove(ch);
                      
                    }
                }
                if(map.isEmpty()==true){
                    curr.add(b);
                    used[j]=true;
                }
            }
            ans.add(curr);
        }

        return ans;
    }
}