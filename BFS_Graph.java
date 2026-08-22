import java.util.*;

class Solution {
    public void bfs(int start, List<Integer>[] adj, boolean[] visited, List<Integer> result) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();

            result.add(v);

            for (int u : adj[v]) {
                if (!visited[u]) {
                    visited[u] = true;
                    queue.add(u);
                }
            }
        }
    }
}