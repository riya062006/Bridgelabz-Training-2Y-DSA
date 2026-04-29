class LibraryDLL {

    static class Node {
        String title, author;
        int id;
        Node prev, next;
        Node(String t, String a, int i) {
            title = t;
            author = a;
            id = i;
        }
    }

    static Node head;

    static void add(String t, String a, int i) {
        Node n = new Node(t, a, i);
        n.next = head;

        if (head != null) head.prev = n;

        head = n;
    }

    static void display() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.title);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        add("B1", "A1", 1);
        add("B2", "A2", 2);
        display();
    }
}