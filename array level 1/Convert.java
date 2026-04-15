import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        int[] arr = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[k++] = matrix[i][j];

        for (int x : arr)
            System.out.print(x + " ");
    }
}