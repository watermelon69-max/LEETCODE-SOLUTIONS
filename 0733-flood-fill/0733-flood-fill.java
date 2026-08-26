class Solution {
    public boolean isValid(int i,int j,int n,int m){
        if(i<0 || i>=n) return false;
        if(j<0 || j>=m) return false;
        return true;
    }

    public void dfs(int row,int col,int [][]ans,int[][]image,int iniColor,int color){
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;

        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};

        for(int i=0;i<4;i++){
            int r=row+drow[i];
            int c=col+dcol[i];
            if(isValid(r,c,n,m)&&image[r][c]==iniColor && ans[r][c]!=color){
                dfs(r,c,ans,image,iniColor,color);
            }
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor=image[sr][sc];
        int ans[][]=new int [image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            ans[i]=Arrays.copyOf(image[i],image[i].length);
        } 
        dfs(sr,sc,ans,image,iniColor,color);
        return ans;
    }
}