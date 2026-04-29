class Problem4 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
        }
    }

    static Node insert(Node r, int v) {
        if (r == null) return new Node(v);

        if (v < r.data) r.left = insert(r.left, v);
        else r.right = insert(r.right, v);

        return r;
    }

    static Node min(Node r) {
        while (r.left != null) r = r.left;

        return r;
    }

    static Node delete (Node r, int v) {
        if (r == null) return null;

        if (v < r.data) r.left = delete (r.left, v);
        else if (v > r.data) r.right = delete (r.right, v);
        else {
            if (r.left == null) return r.right;

            if (r.right == null) return r.left;

            Node t = min(r.right);
            r.data = t.data;
            r.right = delete (r.right, t.data);
        }

        return r;
    }

    static void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {15, 10, 20, 8, 12, 17, 25};
        Node root = null;

        for (int x : a) root = insert(root, x);

        root = delete (root, 10);

        root = insert(root, 14);
        root = insert(root, 9);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.println("Range query uses inorder traversal");
        System.out.println("Best: O(log n), Worst: O(n)");
    }
}
