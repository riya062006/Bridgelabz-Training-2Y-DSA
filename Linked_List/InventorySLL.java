class InventorySLL {

    static class Node {
        String name;
        int id, q;
        double price;
        Node next;
        Node(String n, int i, int q, double p) {
            name = n;
            id = i;
            this.q = q;
            price = p;
        }
    }

    static Node head;

    static void add(String n, int i, int q, double p) {
        Node t = new Node(n, i, q, p);
        t.next = head;
        head = t;
    }

    static double total() {
        Node cur = head;
        double sum = 0;

        while (cur != null) {
            sum += cur.q * cur.price;
            cur = cur.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        add("Item1", 1, 2, 100);
        add("Item2", 2, 3, 50);
        System.out.println(total());
    }
}