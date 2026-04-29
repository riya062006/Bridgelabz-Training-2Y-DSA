class BinarySearchPeak {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 4, 2};
        int l = 0, r = a.length - 1;

        while (l < r) {
            int m = (l + r) / 2;

            if (a[m] < a[m + 1]) l = m + 1;
            else r = m;
        }

        System.out.println(a[l]);
    }
}