class Problem2 {
    static class Node {
        String data;
        Node left, right;
        Node(String d) {
            data = d;
        }
    }

    static void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    static void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    static void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.left = new Node("home");
        root.right = new Node("var");
        root.left.left = new Node("user");
        root.left.right = new Node("docs");
        root.right.right = new Node("log");
        root.left.left.left = new Node("config");

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
    }
}
