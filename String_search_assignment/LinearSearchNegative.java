class LinearSearchNegative {
    public static void main(String[] args) {
        int[] a = {5, 3, -2, 9};
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}