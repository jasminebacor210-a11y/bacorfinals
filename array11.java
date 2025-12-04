
/**
 * Write a description of class array11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array11{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Even index elements:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
