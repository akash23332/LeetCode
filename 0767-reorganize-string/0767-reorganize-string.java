
class Pair implements Comparable<Pair>{
    int freq;
    String ele;
    Pair(int freq,String ele){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return Integer.compare(this.freq,p.freq);
    }
}
class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getValue(), "" + entry.getKey()));
        }
        StringBuilder ans=new StringBuilder();
        Pair prev=null;
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            ans.append(curr.ele);
            curr.freq--;
            if(prev!=null &&prev.freq>0){
                pq.add(prev);
            }
            prev=curr;
        }
        if (ans.length() != s.length()) {
            return "";
        }
         return ans.toString();


        
    }
}