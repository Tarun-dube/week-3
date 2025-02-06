package InputStreamReader;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String fileName="user_input.txt";
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            System.out.println("enter the text and write exit to stop");
            String line;
            while(!(line=br.readLine()).equalsIgnoreCase("exit")){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("input saved to "+fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
