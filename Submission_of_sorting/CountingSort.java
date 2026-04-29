class CountingSort {
    public static void main(String[] args) {
        int[] a = {12, 15, 11, 14, 13, 10, 16};
        int max = 18;
        int[] count = new int[max + 1];

        for (int x : a) count[x]++;

        int k = 0;

        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                a[k++] = i;
            }
        }

        for (int x : a) System.out.print(x + " ");
    }
}