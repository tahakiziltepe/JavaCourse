

public class a015_StringBuffer {
    public static void main(String[] args) {

        // String buffer gives us 16 more places beside our string.
        StringBuffer sb = new StringBuffer("Michael");
        sb.append(" Joe");
        sb.deleteCharAt(1);
        String sb1 = sb.toString();
        System.out.println(sb.capacity());
        System.out.println(sb1);

    }
}
