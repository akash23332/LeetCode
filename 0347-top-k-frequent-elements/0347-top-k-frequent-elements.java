class pair implements Comparable<pair>{
    int ele;
    int freq;
    pair(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(pair p){
        if(this.freq==p.freq){
            return Integer.compare(this.ele,p.ele);
        }
        return Integer.compare(this.freq,p.freq);

    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        } 
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new pair(ele,freq));
            if(pq.size()>k) pq.remove();
         }
         int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.remove().ele;
        }

        return ans;

        
    }
}