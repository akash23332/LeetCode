class Solution {
    List<List<String>> ans=new ArrayList<>();
    List<String> curr=new ArrayList<>();
    public List<List<String>> partition(String s) {
        
        char[] arr=s.toCharArray();
        solve(arr,0, s);
        return ans;
    }
    public void solve(char[] arr,int start,String s){
        if(arr.length==start){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<s.length();i++){

        if(pal(s,start,i)){
            String part=s.substring(start,i+1);
            curr.add(part);
            solve(arr,i+1,s);
            curr.remove(curr.size()-1);
       }
       

        }
       
    }
    
    public boolean pal(String s,int start ,int end){
        char[] arr=s.toCharArray();
        int i=start;
        int j=end;

        boolean flag=true;
        while(i<=j){
            if(arr[i]!=arr[j]){
                flag=false;
            }
            i++;
            j--;
        }
        return flag;
    }
}