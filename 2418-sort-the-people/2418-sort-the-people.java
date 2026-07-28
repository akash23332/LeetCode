class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(heights[j]>heights[min]){
                    min=j;
                }
            }
            int temp1=heights[i];
            heights[i]=heights[min];
            heights[min]=temp1;


            String temp2=names[i];
            names[i]=names[min];
            names[min]=temp2;
        }
        return names;
        
    }
}