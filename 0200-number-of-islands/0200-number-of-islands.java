class Solution {
    public void dfs(int i , int j ,char[][]grid,boolean[][]vis,int n,int m){
            vis[i][j]=true;
            
            int xaxis[]={1,-1,0,0};
            int yaxis[]={0,0,1,-1};

            for(int idx=0;idx<4;idx++){
                int row=i+xaxis[idx];
                int col=j+yaxis[idx];
                if(row>=0 && row<n && col>=0 && col<m && grid[row][col]=='1' && !vis[row][col]){
                    dfs(row,col,grid,vis,n,m);
                }
            }
    }
    public int numIslands(char[][] grid) {
            int n=grid.length;
            int m=grid[0].length;
            int cnt=0;
            boolean [][]vis= new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(i,j,grid,vis,n,m);

                    cnt++;
                }
            }
        }
        return cnt;


    }
}