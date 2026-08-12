class Solution {
    List<List<String>> a=new ArrayList<>();
    List<String> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        
check(0,n,arr);
return a;
    }
    public void check(int row,int n,char[][] arr){
        if(row==n){
            List<String> current=new ArrayList<>();
            for(int i=0;i<n;i++){
                current.add(new String(arr[i]));
            }
            a.add(current);
            return;
        }
        for(int col=0;col<n;col++){
            if(isValid(row,col,n,arr)){
                arr[row][col]='Q';
                check( row+1, n,arr);
                arr[row][col]='.';

            }

        }
    }
    public boolean isValid(int row,int col,int n,char[][] arr){
        int i=row-1;
        while(i>=0){
            if(arr[i][col]=='Q'){
                return false;
                
            }
            i--;
        }
        i=row-1;
        int j=col-1;

        while(i>=0 && j>=0){
            if(arr[i][j]=='Q') return false;
            i--;
            j--;

        }
         i=row-1;
         j=col+1;



        while(i>=0 && j<n){
            if(arr[i][j]=='Q') return false;
            i--;
            j++;

        }
        return true;
    }
}