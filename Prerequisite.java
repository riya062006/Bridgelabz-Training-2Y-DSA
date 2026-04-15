public class Prerequisite {
    public static boolean check(int[] completed, int[] prerequisites) {
        for (int i = 0; i < prerequisites.length; i++) {
            boolean found = false;

            for (int j = 0; j < completed.length; j++) {
                if (prerequisites[i] == completed[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }
        return true;
    }
}