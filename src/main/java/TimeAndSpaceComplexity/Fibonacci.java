package TimeAndSpaceComplexity;

import java.util.Scanner;

public class Fibonacci {
    public static int recursiveFibonacci(int n) {
        if(n<=1)return n;
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }

    public static void iterativeFibonacci(int n) {
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;




        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number for fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long start=System.nanoTime();
       iterativeFibonacci(n);
       long end=System.nanoTime();
       System.out.println("The time for iterative is "+(end-start));

       start=System.nanoTime();
       for(int i=0;i<n;i++){
           System.out.print(recursiveFibonacci(i)+" ");
       }
       end=System.nanoTime();
       System.out.println("The time for recursive fibonacci is "+(end-start));

    }
}
