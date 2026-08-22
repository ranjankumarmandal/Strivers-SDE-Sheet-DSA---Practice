import java.util.*;

class Solution {
    public void dfs(int v, List<Integer>[] adj, boolean[] visited, List<Integer> result) {

        visited[v] = true;

        result.add(v);

        for (int u : adj[v]) {
            if (!visited[u]) {
                dfs(u, adj, visited, result);
            }
        }
    }
}