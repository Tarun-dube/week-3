package challangeProblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareFileReaderAndInputStreamReader {
    public static long countWordsFileReader(String fileName) throws IOException {
        long startTime = System.currentTimeMillis();
        int count = 0;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                count += words.length;

            }
        }
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

    public static long countWordsInputStreamReader(String fileName) throws IOException {
        long startTime = System.currentTimeMillis();
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                count += words.length;

            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


public static void main(String[] args) throws IOException {
    long fileReaderTime = countWordsFileReader("example.txt");
    System.out.println("fileReaderTime = " + fileReaderTime);
    long inputStreamReaderTime = countWordsInputStreamReader("example.txt");
    System.out.println("inputStreamReaderTime = " + inputStreamReaderTime);

}
}
