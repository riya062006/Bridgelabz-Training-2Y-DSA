class BinarySearchFirstLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3};
        int t = 2;
        int first = -1, last = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                if (first == -1) first = i;

                last = i;
            }
        }

        System.out.println(first + " " + last);
    }
}