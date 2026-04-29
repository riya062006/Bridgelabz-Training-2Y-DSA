import java.util.*;

class CityRoadGraph {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    static void bfs(String s) {
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();

        q.add(s);
        vis.add(s);

        while (!q.isEmpty()) {
            String cur = q.poll();
            System.out.print(cur + " ");

            for (String nei : graph.getOrDefault(cur, new ArrayList<>())) {
                if (!vis.contains(nei)) {
                    vis.add(nei);
                    q.add(nei);
                }
            }
        }
    }

    public static void main(String[] args) {
        addEdge("A", "B");
        addEdge("B", "C");
        addEdge("C", "B");
        addEdge("A", "D");
        addEdge("D", "A");
        addEdge("D", "E");
        addEdge("C", "E");

        bfs("A");
    }
}
