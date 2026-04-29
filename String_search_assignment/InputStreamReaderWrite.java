import java.io.*;
class InputStreamReaderWrite {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        String s;

        while (!(s = br.readLine()).equals("exit")) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}