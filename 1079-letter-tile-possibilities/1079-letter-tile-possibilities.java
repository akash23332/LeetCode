class Solution {
    int count=0;
    public int numTilePossibilities(String tiles) {
        char[] arr=tiles.toCharArray();
        Arrays.sort(arr);
        boolean[] unique=new boolean[tiles.length()];
   
        solve(unique,tiles,arr);
        return count;
        
    }
    public void solve(boolean[] unique,String tiles,char[] arr){
        
        for(int i=0;i<arr.length;i++){

            if(unique[i])
                continue;
            if(i>0 && arr[i]==arr[i-1] && !unique[i-1]){
                continue;
            }
            count++;
            unique[i]=true;
            solve(unique,tiles,arr);
            unique[i]=false;
        }

    }
}