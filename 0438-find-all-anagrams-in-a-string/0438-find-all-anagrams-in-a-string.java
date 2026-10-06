class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> pmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int len=p.length();
        for(int i=0;i<p.length();i++){
       
            char ch=p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
    
        while(j<s.length()){
            char ch=s.charAt(j);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            if(j-i+1==len){
                if(pmap.equals(smap)){
                    ans.add(i);
                }
                char left = s.charAt(i);
                smap.put(left,smap.get(left)-1);
                if(smap.get(left)==0){
                    smap.remove(left);

                }
                i++;
            }
            
            j++;
        }
        return ans;

            
     

            }
        }

        
