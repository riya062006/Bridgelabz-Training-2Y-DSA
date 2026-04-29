class SocialMediaSLL {

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
        t.next = head;
        head = t;
    }

    static void display() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.name);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        add(1, "A");
        add(2, "B");
        display();
    }
}