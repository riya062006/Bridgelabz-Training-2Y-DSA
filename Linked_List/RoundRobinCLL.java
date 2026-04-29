class RoundRobinCLL {

    static class Node {
        int id, time;
        Node next;
        Node(int i, int t) {
            id = i;
            time = t;
        }
    }

    static Node head;

    static void add(int i, int t) {
        Node n = new Node(i, t);

        if (head == null) {
            head = n;
            head.next = head;
            return;
        }

        Node cur = head;

        while (cur.next != head) cur = cur.next;

        cur.next = n;
        n.next = head;
    }

    public static void main(String[] args) {
        add(1, 5);
        add(2, 3);
        System.out.println("Processes added");
    }
}