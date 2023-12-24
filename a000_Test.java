import java.util.Arrays;

public class a000_Test {
    public static void main(String[] args) {
        int[] array = new int[5];
		Arrays.setAll(array, i -> i);
		System.out.println(Arrays.toString(array));
    }
}
