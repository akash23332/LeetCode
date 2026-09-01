class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean search(char[][] board, String word,int r,int c,int idx){

        if(idx==word.length()){
            return true;
        }
        if(r<0 || r>=board.length || c<0 || c>=board[0].length){
            return false;
        }
        if(board[r][c]!=word.charAt(idx)){
            return false;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean found=
        search(board,word,r+1,c,idx+1)||
        search(board,word,r-1,c,idx+1)||
        search(board,word,r,c+1,idx+1)||
        search(board,word,r,c-1,idx+1);

        board[r][c]=temp;
        return found;



    }
}