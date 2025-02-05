package stringbuffer;

public class StringArray {
    public static StringBuffer concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);

        }
        return sb;
    }
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "!";
       StringBuffer s= concatenateStrings(strings);
       System.out.println(s);




    }
}
