/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take one string input from user.
 *The output tells us whether the alphabets in the string is vowel or consonant.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Akuthota Naneeth
 */
public class Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any character:");
        String  third = scan.nextLine();
        for (int i = 0; i < third.length(); i++) {
            char    t = third.charAt(i);

            /*if-else loop  determines the alphabet is vowel or consonant*/
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'|| t == 'A'|| t == 'E'|| t == 'I'|| t == 'O'|| t == 'U') {
                System.out.print("Vowel ");
            }
            else  {
                System.out.print("Consonant ");
            }
        }
    }
}