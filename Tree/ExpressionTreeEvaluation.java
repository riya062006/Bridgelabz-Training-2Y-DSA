class Problem5 {
    static class Node {
        String data;
        Node left, right;
        Node(String d) {
            data = d;
        }
    }

    static void inorder(Node r) {
        if (r != null) {
            System.out.print("(");
            inorder(r.left);
            System.out.print(r.data);
            inorder(r.right);
            System.out.print(")");
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
        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");
        root.left.left = new Node("3");
        root.left.right = new Node("5");
        root.right.left = new Node("8");
        root.right.right = new Node("2");

        System.out.print("Postfix: ");
        postorder(root);
        System.out.println();

        System.out.print("Infix: ");
        inorder(root);
        System.out.println();

        System.out.print("Prefix: ");
        preorder(root);
        System.out.println();
    }
}
