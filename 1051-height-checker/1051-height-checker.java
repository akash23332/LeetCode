class Solution {
    public int heightChecker(int[] heights) {
        int[] res=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            res[i]=heights[i];
        }
        Arrays.sort(res);
        int i=0;
        int j=0;int c=0;
        while(i<heights.length){
            if(heights[i]!=res[j]){
                c++;
            }
            i++;
            j++;
        }
        return c;
        
        
        
    }
}