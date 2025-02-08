package TimeAndSpaceComplexity;

import java.util.Scanner;

public class Concatenate {
    public static void stringConcatenate(String s,int n) {
      String s1="hello";
      for(int i=1;i<=n;i++) {
          s.concat(s1);
      }
    }
    public static void stringBuilderConcatenate(StringBuilder s,int n) {
      String s1="hello";
      for(int i=1;i<=n;i++) {
          s.append(s1);
      }
    }
    public static void stringBufferConcatenate(StringBuffer s,int n) {
      String s1="hello";
      for(int i=1;i<=n;i++) {
          s.append(s1);
      }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of time you want to concatenate");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // string
        String s="";
        long start=System.nanoTime();
        stringConcatenate(s,n);
        long end=System.nanoTime();
        long time=end-start;
        System.out.println("The concatenated time for string is "+time);

        // strign builder
        StringBuilder s1=new StringBuilder();
        start=System.nanoTime();
        stringBuilderConcatenate(s1,n);
        end=System.nanoTime();
        time=end-start;
        System.out.println("The concatenated time for string builder is "+time);

        //string buffer
        StringBuffer s2=new StringBuffer();
        start=System.nanoTime();
        stringBufferConcatenate(s2,n);
        end=System.nanoTime();
        time=end-start;
        System.out.println("The concatenated time for string buffer is "+time);


    }
}
