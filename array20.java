
/**
 * Write a description of class array20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array20
{
   public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 18, 50};

        System.out.println("Even numbers greater than 20:");
        for (int x : arr) {
            if (x % 2 == 0 && x > 20) {
                System.out.println(x);
            }
        }
    }
}
