class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pq.size()<k){
                    pq.add(matrix[i][j]);
                }else if(matrix[i][j]<pq.peek()){
                    pq.remove();
                    pq.add(matrix[i][j]);
                }
            }

            
        }

        return pq.peek();
        
        
    }
}