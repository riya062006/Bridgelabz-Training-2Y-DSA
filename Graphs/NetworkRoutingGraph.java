import java.util.*;

class NetworkRoutingGraph {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void bfs(String s) {
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();

        q.add(s);
        vis.add(s);

        while (!q.isEmpty()) {
            String cur = q.poll();
            System.out.print(cur + " ");

            for (String nei : graph.get(cur)) {
                if (!vis.contains(nei)) {
                    vis.add(nei);
                    q.add(nei);
                }
            }
        }
    }

    public static void main(String[] args) {
        addEdge("R1", "R2");
        addEdge("R1", "R3");
        addEdge("R2", "R4");
        addEdge("R3", "R4");
        addEdge("R4", "R5");
        addEdge("R5", "R6");

        bfs("R1");
    }
}
