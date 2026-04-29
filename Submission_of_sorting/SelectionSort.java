class SelectionSort {
    public static void main(String[] args) {
        int[] a = {88, 55, 99, 33, 22};

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }

            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

        for (int x : a) System.out.print(x + " ");
    }
}""