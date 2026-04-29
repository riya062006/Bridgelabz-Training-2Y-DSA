class WordSearchBacktracking {

    static char[][] grid = {
        {'C', 'A', 'T', 'S'},
        {'O', 'R', 'E', 'A'},
        {'D', 'E', 'A', 'M'},
        {'E', 'L', 'L', 'S'}
    };

    static boolean dfs(int i, int j, String w, int k, boolean[][] vis) {
        if (k == w.length()) return true;

        if (i < 0 || j < 0 || i >= 4 || j >= 4 || vis[i][j] || grid[i][j] != w.charAt(k)) return false;

        vis[i][j] = true;

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (dfs(i + x, j + y, w, k + 1, vis)) return true;
            }
        }

        vis[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        String word = "DREAM";
        boolean found = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boolean[][] vis = new boolean[4][4];

                if (dfs(i, j, word, 0, vis)) {
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found);
    }
}