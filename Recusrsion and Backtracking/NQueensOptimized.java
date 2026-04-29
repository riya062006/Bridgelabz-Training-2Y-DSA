class NQueensOptimized {

    static int n = 4;
    static int[] board = new int[n];
    static boolean[] col = new boolean[n];
    static boolean[] d1 = new boolean[2 * n];
    static boolean[] d2 = new boolean[2 * n];

    static boolean solve(int r) {
        if (r == n) return true;

        for (int c = 0; c < n; c++) {
            if (!col[c] && !d1[r + c] && !d2[r - c + n]) {
                board[r] = c;
                col[c] = true;
                d1[r + c] = true;
                d2[r - c + n] = true;

                if (solve(r + 1)) return true;

                col[c] = false;
                d1[r + c] = false;
                d2[r - c + n] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        solve(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) System.out.print("Q ");
                else System.out.print(". ");
            }

            System.out.println();
        }
    }
}