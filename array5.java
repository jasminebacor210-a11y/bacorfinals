
/**
 * Write a description of class array5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class array5{
     public static void main (String[] args){
         int[] arr= {10,15,20,25,30};
         
         for (int x: arr){
             if (x==20){
                 System.out.println("Found 20!");
                 break;
             }
         }
        
        }
    }