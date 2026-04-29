import java.io.*;
class InputStreamReaderRead {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}