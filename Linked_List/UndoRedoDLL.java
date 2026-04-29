class UndoRedoDLL {

    static class Node {
        String text;
        Node prev, next;
        Node(String t) {
            text = t;
        }
    }

    static Node cur;

    static void add(String t) {
        Node n = new Node(t);

        if (cur != null) {
            cur.next = n;
            n.prev = cur;
        }

        cur = n;
    }

    static void undo() {
        if (cur.prev != null) cur = cur.prev;
    }

    static void redo() {
        if (cur.next != null) cur = cur.next;
    }

    public static void main(String[] args) {
        add("A");
        add("AB");
        undo();
        System.out.println(cur.text);
    }
}