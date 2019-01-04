/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The takes a string as input and reverses the given string as output.
 *
 * @version 1.10 31-Dec-2018
 * @author Akuthota Naneeth
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any string to reverse:");

        /* next line takes string input */
        String s = scan.nextLine();

        /* This print the characters of string in reverse order */
        System.out.println(reversedString(s));
    }
public static String reversedString(String s){
        int      length = s.length();
    String     reverse="";
        for(int i=length-1;i >= 0;i--){
           reverse=reverse + s.charAt(i);
        }
        return reverse;
    }
}