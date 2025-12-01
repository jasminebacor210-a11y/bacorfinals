
/**
 * Write a description of class Arrayproblem4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Arrayproblem4
{
  public static void main (String [] args) {
        int[] arr = {5, 8, 2, 9, 3, };
        int min = arr[0], max = arr[0];
 
        for (int x: arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
 
        System.out.println("Smallets: = " + min + ", Largest: " + max);
    }
}