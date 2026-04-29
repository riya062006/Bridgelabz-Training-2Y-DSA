class LinearSearchSentence {
    public static void main(String[] args) {
        String[] arr = {"hello world", "java code", "data structures"};
        String word = "java";

        for (String s : arr) {
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Not Found");
    }
}