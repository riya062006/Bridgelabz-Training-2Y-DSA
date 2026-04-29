class TaskCircularLL {

    static class Node {
        int id;
        String name;
        Node next;
        Node(int i, String n) {
            id = i;
            name = n;
        }
    }

    static Node head;

    static void add(int i, String n) {
        Node t = new Node(i, n);

        if (head == null) {
            head = t;
            head.next = head;
            return;
        }

        Node cur = head;

        while (cur.next != head) cur = cur.next;

        cur.next = t;
        t.next = head;
    }

    static void display() {
        Node cur = head;

        if (cur == null) return;

        do {
            System.out.println(cur.id + " " + cur.name);
            cur = cur.next;
        } while (cur != head);
    }

    public static void main(String[] args) {
        add(1, "Task1");
        add(2, "Task2");
        display();
    }
}