/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take number as input from user till the user correctly guesses the number.
 *The output tells us whether the input is greater or smaller or equal to the original number.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Akuthota Naneeth
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean b=false;
        int value   =37;
        while(b==false) {
            System.out.println("Guess the number");

            /*next line takes an int as input*/
            int n = scan.nextInt();
            if (n == value) {
                b=true;
                /*if input is equal to original number then below line prints*/
                System.out.println("Number guessed matches the original number");
            }
            else if (n > value) {

                /*if input is more than original number then below line prints.
                  and asks the user to enter another number*/
                System.out.println(" Number guessed is more than original number");
            }
            else if (n < value) {

                  /*if input is less than original number then below line prints.
                  and asks the user to enter another number*/
                System.out.println(" Number guessed is less than original number");
            }
        }
    }
}
