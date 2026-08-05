
class pair implements Comparable<pair>{
    int val;
    int idx;
    pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
    public int compareTo(pair p){
        return Integer.compare(this.val,p.val);
    }
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            int val=score[i];
            pq.add(new pair(val,i));
        }
        String[] s=new String[score.length];
        for(int i=0;i<score.length;i++){
            pair p=pq.remove();
           if (i == 0)
           s[p.idx] = "Gold Medal";
        else if (i == 1)
        s[p.idx] = "Silver Medal";
        else if (i == 2)
        s[p.idx] = "Bronze Medal";
        else
        s[p.idx] = String.valueOf(i + 1);

        }
        return s;

        
       

        
    }
}