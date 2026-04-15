import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] even = new int[n/2 + 1];
        int[] odd = new int[n/2 + 1];

        int e = 0, o = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Even:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");

        System.out.println("\nOdd:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");
    }
}