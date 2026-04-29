class MovieDLL {

    static class Node {
        String title, dir;
        int year;
        double rating;
        Node prev, next;
        Node(String t, String d, int y, double r) {
            title = t;
            dir = d;
            year = y;
            rating = r;
        }
    }

    static Node head, tail;

    static void add(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);

        if (head == null) {
            head = tail = n;
            return;
        }

        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    static void display() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.title + " " + cur.rating);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        add("M1", "D1", 2020, 4.5);
        add("M2", "D2", 2021, 4.2);
        display();
    }
}