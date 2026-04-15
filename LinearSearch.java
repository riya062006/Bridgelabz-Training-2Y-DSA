public class LinearSearch {
    public static boolean findUsername(String[] userList, String target) {
        for (int i = 0; i < userList.length; i++) {
            if (userList[i].equals(target)) {
                return true;
            }
        }
        return false;
    }
}