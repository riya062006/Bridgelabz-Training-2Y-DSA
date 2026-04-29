import java.io.*;
class FileReaderWordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line;
        int count = 0;
        String word = "java";

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String w : words) {
                if (w.equals(word)) count++;
            }
        }

        br.close();
        System.out.println(count);
    }
}