
/**
 * Write a description of class array8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class array8{
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Array B: " + Arrays.toString(B));
    }
}
