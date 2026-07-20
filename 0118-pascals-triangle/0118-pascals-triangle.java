class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
       
        for(int row=0;row<numRows;row++){
             List<Integer> s=new ArrayList<>();
             for(int col=0;col<=row;col++){
                if(col==0|| col==row){
                    s.add(1);
                }else{
                      int value=ans.get(row-1).get(col-1)+ans.get(row-1).get(col);
                s.add(value);
                }
              
             }
             ans.add(s);
        }
        
        return ans;
        
    }
}