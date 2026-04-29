class StudentRecordSLL {

    static class Node {
        int roll;
        String name;
        int age;
        String grade;
        Node next;
        Node(int r, String n, int a, String g) {
            roll = r;
            name = n;
            age = a;
            grade = g;
        }
    }

    static Node head;

    static void add(int r, String n, int a, String g) {
        Node t = new Node(r, n, a, g);

        if (head == null) {
            head = t;
            return;
        }

        Node cur = head;

        while (cur.next != null) cur = cur.next;

        cur.next = t;
    }

    static void display() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.roll + " " + cur.name + " " + cur.grade);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        add(1, "A", 20, "A");
        add(2, "B", 21, "B");
        display();
    }
}