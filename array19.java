
/**
 * Write a description of class array19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array19{
    public static void main(String[] args) {
        String[] names = {"Ana", "Ben", "Cris", "Diana"};
        int[] grades = {85, 90, 78, 92};

        System.out.println("Student Grades:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }
}
  