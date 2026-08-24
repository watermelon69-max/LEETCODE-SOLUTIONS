class Solution {
    public void bfs(int node, boolean[] vis, int[][] adj) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        vis[node] = true;
        while (!q.isEmpty()) {
            int graphNode = q.poll();
            for (int adjNode = 0; adjNode < adj.length; adjNode++) {
                if (adj[graphNode][adjNode] == 1 && !vis[adjNode]) {
                    vis[graphNode]=true;
                    q.offer(adjNode);
                }
            }

        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] vis = new boolean[V];
        int cnt = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                cnt++;
                bfs(i, vis, isConnected);
            }
        }
        return cnt;
    }
}