package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter targeted word: ");
        String w=sc.nextLine();
        int count=0;

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("file.txt"))){
                      String line;
                      while((line=bufferedReader.readLine())!=null){
                          String[] words=line.split("\\W+"); //split by non character words
                          for(String word:words){
                              if(word.equals(w)){
                                  count++;

                              }

                          }

                      }
                      System.out.println(count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
