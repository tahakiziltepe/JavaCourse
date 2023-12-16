
public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);

            for (int j = 9; j <= 17; j++) {
                System.out.println(j + " - " + (j+1));
            }
        }

        // Another way.
        int i1 = 1;
        for (;i1 <= 5;) {
            System.out.println("Day " + i1);
            i1++;
        }
    }
}
