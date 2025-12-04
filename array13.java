
/**
 * Write a description of class array13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array13{
    public static void main(String[] args) {
        int[] grades = {80, 60, 90, 72, 88, 50};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}