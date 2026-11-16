class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        String str="";
        while(map.size()>0){
            int max=0;
            char a=' ';
            for(char c:map.keySet()){
                if(map.get(c)>=max){
                    max=map.get(c);
                    a=c;

                    
                }

            }
            for(int i=1;i<=max;i++){
                str+=a;
            }
            map.remove(a);
            
        }
        return str;
        



        
    }
}