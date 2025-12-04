
/**
 * Write a description of class array16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class array16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digits = String.valueOf(num).length();

        System.out.println("Number of digits: " + digits);
    }
}
   
