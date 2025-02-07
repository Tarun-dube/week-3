package stringbuffer;

public class CompareTime {
    public static void compare(){
        //testig performance for stringbuilder
        StringBuilder a = new StringBuilder();
        String s="hello";
        long start=System.nanoTime();
        for(int i=0; i<1000000; i++){
            a.append(s);

        }
        long end=System.nanoTime();
        System.out.println("Time for StringBuilder: "+ (end-start)+" nanoseconds");

        //testing performance for string buffer
        StringBuilder b = new StringBuilder();
        start=System.nanoTime();
        for(int i=0; i<1000000; i++){
            b.append(s);

        }
         end=System.nanoTime();
        System.out.println("Time for StringBuffer: "+ (end-start)+" nanoseconds");

    }

    public static void main(String[] args) {
        compare();


    }
}
