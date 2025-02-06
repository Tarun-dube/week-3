package InputStreamReader;

import java.io.*;


import static java.nio.charset.StandardCharsets.*;

public class BinaryToCharacter {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader( new InputStreamReader(new FileInputStream("binary.txt"),"UTF-8"))){
            String line;
            while((line=br.readLine())!=null){
                System.out.print(line);

            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
