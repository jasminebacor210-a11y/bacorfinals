
/**
 * Write a description of class array7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class array7{
     public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 7, -9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i]; // convert negative to positive
            }
        }

        System.out.println("Converted array: " + Arrays.toString(arr));
    }
}
