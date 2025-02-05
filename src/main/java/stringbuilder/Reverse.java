package stringbuilder;


import java.util.Scanner;
public class Reverse {
   public static String reverse(String s) {
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        s=builder.toString();
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

       System.out.println(reverse(s));

    }
}
