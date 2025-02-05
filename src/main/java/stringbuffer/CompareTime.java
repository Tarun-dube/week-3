package stringbuffer;

public class CompareTime {
    public static void compare(StringBuilder a, StringBuffer b){
        //testig performance for stringbuilder
        String s="hello";
        long start=System.nanoTime();
        for(int i=0; i<1000000; i++){
            a.append(s);

        }
        long end=System.nanoTime();
        System.out.println("Time for StringBuilder: "+ (end-start)+" nanoseconds");

        //testing performance for string buffer
        start=System.nanoTime();
        for(int i=0; i<1000000; i++){
            b.append(s);

        }
         end=System.nanoTime();
        System.out.println("Time for StringBuffer: "+ (end-start)+" nanoseconds");

    }

    public static void main(String[] args) {
        StringBuilder a=new StringBuilder();
        StringBuffer b=new StringBuffer();
        compare(a,b);


    }
}
