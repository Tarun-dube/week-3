package stringbuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static StringBuilder removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);

            }

        }
        return result;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      StringBuilder result = removeDuplicates(s);
      System.out.println(result);

    }
}
