class Problem3 {
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

    static void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {50, 30, 70, 20, 40, 60, 80, 10, 25};
        Node root = null;

        for (int x : a) root = insert(root, x);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.println("Search path for 25: 50 -> 30 -> 20 -> 25");
        System.out.println("Given tree is not BST because 65 is in left subtree of 70 but greater than 60");
        System.out.println("Skewed height: 8");
    }
}
