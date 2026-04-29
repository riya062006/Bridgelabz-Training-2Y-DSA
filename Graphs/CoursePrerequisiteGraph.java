import java.util.*;

class CoursePrerequisiteGraph {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    static boolean cycleDFS(String v, Set<String> vis, Set<String> rec) {
        if (rec.contains(v)) return true;

        if (vis.contains(v)) return false;

        vis.add(v);
        rec.add(v);

        for (String nei : graph.getOrDefault(v, new ArrayList<>())) {
            if (cycleDFS(nei, vis, rec)) return true;
        }

        rec.remove(v);
        return false;
    }

    static void topo() {
        Map<String, Integer> indeg = new HashMap<>();

        for (String u : graph.keySet()) {
            indeg.putIfAbsent(u, 0);

            for (String v : graph.get(u)) {
                indeg.put(v, indeg.getOrDefault(v, 0) + 1);
            }
        }

        Queue<String> q = new LinkedList<>();

        for (String k : indeg.keySet()) {
            if (indeg.get(k) == 0) q.add(k);
        }

        while (!q.isEmpty()) {
            String cur = q.poll();
            System.out.print(cur + " ");

            for (String nei : graph.getOrDefault(cur, new ArrayList<>())) {
                indeg.put(nei, indeg.get(nei) - 1);

                if (indeg.get(nei) == 0) q.add(nei);
            }
        }
    }

    public static void main(String[] args) {
        addEdge("CS101", "CS102");
        addEdge("CS101", "CS201");
        addEdge("CS102", "CS202");
        addEdge("MATH101", "CS201");

        System.out.println("Cycle: " + cycleDFS("CS101", new HashSet<>(), new HashSet<>()));
        topo();
    }
}
