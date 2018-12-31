/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The takes a number as input and prints the number as many times as the number is till the input number.
 * @version 1.10 31-Dec-2018
 *
 * @author Akuthota Naneeth
 */
public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");

        /* This takes an int as input. */
        int     four = scan.nextInt();

    for(int i=0;i<=four;i++){
        for(int j=0;j<i;j++) {

            /*prints the number as many times as the number is till the input number. */
            System.out.print(i +" ");
        }
      }
    }
}
