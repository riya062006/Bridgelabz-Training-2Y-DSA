public class BinarySearch {
    public static boolean findUsername(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = arr[mid].compareTo(target);

            if (cmp == 0)
                return true;
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}