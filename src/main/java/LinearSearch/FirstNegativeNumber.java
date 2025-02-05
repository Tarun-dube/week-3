package LinearSearch;

import java.util.Scanner;

public class FirstNegativeNumber {
    static int negative(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Index of First negative number is "+negative(a));


    }
}
