package LinearSearch;

import java.util.Scanner;

public class SpecificWords {
    static String specificWords(String words,String[] a) {

        for(int i=0;i<a.length;i++) {
            if(words.equals(a[i])) {
                return a[i];

            }
        }


            return "Not Found";

    }
    public static void main(String[] args) {
        String[] s={"tarun" , " is"," a"," good"," boy"};

        System.out.println(specificWords("tarun",s));

    }
}
