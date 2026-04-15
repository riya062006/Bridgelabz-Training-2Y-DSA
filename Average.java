public class Average {
    public static double findAverage(int[] temperature, int n) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + temperature[i];
        }

        double average = (double) total / n;
        return average;
    }

    public static void main(String[] args) {
        int[] temp = {20, 25, 22, 24, 21};
        System.out.println(findAverage(temp, temp.length));
    }
}