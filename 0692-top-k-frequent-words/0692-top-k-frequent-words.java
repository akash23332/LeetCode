class pair implements Comparable<pair>{
    String s;
    int freq;
    pair(String s,int freq){
        this.s=s;
        this.freq=freq;
    }
    @Override
    public int compareTo(pair p){
        if(this.freq!=p.freq){
            return Integer.compare(this.freq,p.freq);
        }
        return p.s.compareTo(this.s);
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
           HashMap<String, Integer> map = new HashMap<>();

        for(String ele : words){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(String e:map.keySet()){
            pq.add(new pair(e,map.get(e)));
            if(pq.size()>k){
                pq.remove();
            }
        }
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.remove().s);
        }

        // Heap gives smallest first, reverse to get correct order
        Collections.reverse(ans);

        return ans;
    }
}