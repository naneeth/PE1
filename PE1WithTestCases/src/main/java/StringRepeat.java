/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class reads String using Scanner Class and adds the  input-digit alphabets from last
 *to the input n-times.
 *
 * @version 1.10 31-Dec-2018
 * @author Akuthota Naneeth
 */
public class StringRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string");

        /* next line takes string input */
        String s = scan.nextLine();
        System.out.println("enter the number");

        /* next line takes integer input  */
        int l = scan.nextInt();
        System.out.println(stringRepeat(s,l));
    }
    public static String stringRepeat(String s,int l){

        int     length = s.length();
        String repeat=s;
        String last="";

        for(int i=length-l;i<length;i++){
            last = last+s.charAt(i);
        }
        for (int j = 0; j < l; j++) {
            repeat=repeat+last;
        }
return repeat;
    }
}
