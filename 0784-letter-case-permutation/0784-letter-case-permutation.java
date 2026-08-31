class Solution {
    List<String> ans=new ArrayList<>();
    
    public List<String> letterCasePermutation(String s) {
        char[] arr=s.toCharArray();
        perm(arr,0);
        return ans;
        
    }
    public void perm(char[] arr,int i){
        if(i==arr.length){
            ans.add(new String(arr));
            return;
        }


        if(Character.isLetter(arr[i])){
            arr[i]=Character.toLowerCase(arr[i]);
            perm(arr,i+1);

            arr[i]=Character.toUpperCase(arr[i]);
            perm(arr,i+1);
        }
        else{
            perm(arr,i+1);
        }
    }
}