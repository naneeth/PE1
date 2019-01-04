/*/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take long int as input from user and first checks whether the number is palindrome or not.
 *If palindrome then it checks the sum of even numbers in the number is greater than or less than 25.
 *
 * @version 1.10 31-Dec-2018
 * @author Akuthota Naneeth
 */

public class Palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = scan.nextInt();
        System.out.println(palindromeSum(num));
    }


     public static String palindromeSum(int first){
        boolean      q = palindrome(first);
        boolean      e = even(first);
        if (!q) {
            return first + " is not palindrome";
        }
        else {
                if(e==true){
                   return first + " is palindrome and sum of even numbers is less than 25";
                }
                else{
                    return first + " is palindrome and sum of even numbers is greater than 25";
                }
        }
    }

    /*This is a method which checks whether the number is palindrome or not.*/
    public static  boolean palindrome(int a) {
        int    num = 0;
        int    rem;
        int    k = a;
        boolean     p = false;
        while (k > 0) {
            rem  = k % 10;
            num  = num*10 + rem;
            k    = k / 10;
        }

        if (num == a) {
            p = true;
        }
        return p;
    }
    /*This is a method which checks whether the sum of even numbers in number is greater or less than 25*/
   public  static boolean even(int a) {
        boolean w = false;
        int count = 0;
        while (a > 0) {

           int k = a % 10;
            if (k % 2 == 0) {
                count = count+k;
            }
            a = a / 10;
        }

        if (count < 25) {
            w = true;
        }
        return w;
    }
}








