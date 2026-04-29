import java.util.*;

class SocialNetworkGraph {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void friends(String u) {
        System.out.println(graph.get(u));
    }

    static boolean direct(String u, String v) {
        return graph.get(u).contains(v);
    }

    static void shortest(String s, String d) {
        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> vis = new HashSet<>();

        q.add(s);
        vis.add(s);

        while (!q.isEmpty()) {
            String cur = q.poll();

            if (cur.equals(d)) break;

            for (String nei : graph.get(cur)) {
                if (!vis.contains(nei)) {
                    vis.add(nei);
                    parent.put(nei, cur);
                    q.add(nei);
                }
            }
        }

        List<String> path = new ArrayList<>();
        String cur = d;

        while (cur != null) {
            path.add(cur);
            cur = parent.get(cur);
        }

        Collections.reverse(path);
        System.out.println(path);
    }

    public static void main(String[] args) {
        addEdge("Alice", "Bob");
        addEdge("Alice", "Charlie");
        addEdge("Bob", "David");
        addEdge("Charlie", "Eve");
        addEdge("David", "Eve");

        friends("Alice");
        System.out.println(direct("Bob", "Eve"));
        shortest("Alice", "Eve");
    }
}
