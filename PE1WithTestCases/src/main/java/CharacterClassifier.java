/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
* The class take one input from user. The output tells us whether the input is small letter,
 *
 *capital or digit or special character based on the ASCII values.
 *
 * @version 1.10 31-Dec-2018
 * @author Akuthota Naneeth
 */
public class CharacterClassifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* this line takes a character as input */
        System.out.print("Enter any character:");
        char c = scan.next().charAt(0);

        System.out.println(characterClassifier(c));
    }

    public static String characterClassifier(char c) {
        String output;
        int ascii = (int) c;
        /*if-else loop compares the value with ascii and determines the type of the character*/
        if (ascii >= 65 && ascii <= 90) {
            output="CAPITAL LETTER";
        } else if (ascii >= 97 && ascii <= 122) {
            output="SMALL LETTER";
        } else if (ascii >= 48 && ascii <= 57) {
            output="DIGIT";
        } else {
            output="SPECIAL CHARACTER";
        }
        return output;
    }
}
