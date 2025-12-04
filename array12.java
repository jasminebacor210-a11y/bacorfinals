
/**
 * Write a description of class array12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array12{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 4};
        int valueToCheck = 1;
        int count = 0;

        for (int x : arr) {
            if (x == valueToCheck) {
                count++;
            }
        }

        if (count >= 3) {
            System.out.println(valueToCheck + " appears at least 3 times.");
        } else {
            System.out.println(valueToCheck + " does NOT appear 3 times.");
        }
    }
}
