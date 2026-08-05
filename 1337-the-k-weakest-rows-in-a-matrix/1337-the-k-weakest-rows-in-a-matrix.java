
class pair implements Comparable<pair>{
    int idx;
    int count;
    pair(int idx,int count){
        this.idx=idx;
        this.count=count;

    }
       public int compareTo(pair p){
        if (this.count == p.count) {
        return Integer.compare(this.idx, p.idx);
    }
    return Integer.compare(this.count, p.count);

    }
}
class Solution {
    public int[] kWeakestRows(int[][] arr, int k) {
        int n=arr.length;
        int m=arr[0].length;
       
        
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
             int c=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                      c++;

                }
              

            }
            pq.add(new pair(i,c));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.remove().idx;
        }
        return ans;
        
       
    }
}