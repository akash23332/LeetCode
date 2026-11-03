class Solution {
     public static void bfs(int row,int col,boolean[][] visited,int n,int m,char[][] grid){
            Queue<int[]> q=new LinkedList<>();
            q.add(new int[]{row,col});
            visited[row][col]=true;
            while(q.size()>0){
                int[] front=q.remove();
                int r=front[0];
                int c=front[1];
              
                    if(  c+1<m &&  grid[r][c+1]=='1' && !visited[r][c+1]){
                        q.add(new int[]{r,c+1});
                        visited[r][c+1]=true;
                    }
                     if(  c-1>=0 &&  grid[r][c-1]=='1' && !visited[r][c-1]){
                        q.add(new int[]{r,c-1});
                        visited[r][c-1]=true;
                    }
                    if(  r+1<n &&  grid[r+1][c]=='1' && !visited[r+1][c]){
                        q.add(new int[]{r+1,c});
                        visited[r+1][c]=true;
                    }
                    if(  r-1>=0 &&  grid[r-1][c]=='1' && !visited[r-1][c]){
                        q.add(new int[]{r-1,c});
                        visited[r-1][c]=true;
                    }

                    
                
            }
        }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                bfs(i,j,visited,n,m,grid);
                count++;
            }

            }
            
        }
        
       
        return count;
    }
}