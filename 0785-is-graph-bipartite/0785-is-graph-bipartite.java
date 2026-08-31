class Solution {
    public boolean bfs(int node, int[] color, int graph[][]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        color[node] = 0;
        while (!q.isEmpty()) {
            int start = q.poll();
            for (int it : graph[start]) {
                if (color[it] == -1) {
                    color[it] = 1 - color[start];
                    q.offer(it);
                } else if (color[it] == color[start]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!bfs(i,color,graph)){
                    return false;
                }
            }
        }
        return true;
    }
}