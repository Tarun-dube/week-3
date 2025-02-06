package challangeProblem;

import java.sql.Time;

public class CompareTime {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
       long start= System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append("hello");
        }
        long end= System.nanoTime();
        long time= end - start;
        System.out.println("time taken by builder is "+time+" ns");

        StringBuffer sb = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");

        }
        end= System.nanoTime();
        time= end - start;

        System.out.println("time taken by string is "+time +" ns");



    }
}
