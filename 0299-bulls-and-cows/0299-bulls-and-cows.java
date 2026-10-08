class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map=new HashMap<>();
        int cows=0;
        int bulls=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;

            }else{
                char ch=secret.charAt(i);
                 map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            if(secret.charAt(i)==guess.charAt(i)){
                continue;

            }
            if(map.getOrDefault(ch,0)>0){
                cows++;
                map.put(ch,map.get(ch)-1);
            }
        }
        return bulls+"A"+cows+"B";
        
    }
}