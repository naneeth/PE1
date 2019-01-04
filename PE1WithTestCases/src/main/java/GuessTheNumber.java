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
            System.out.println("Guess the number");

            /*next line takes an int as input*/
            int n = scan.nextInt();
        System.out.println(guessNumber(n));
    }

            public static String guessNumber(int num){
                int value   =37;
            if (num == value) {

                /*if input is equal to original number then below line prints*/
                return "Number guessed matches the original number";
            }
            else if (num > value) {

                /*if input is more than original number then below line prints.
                  and asks the user to enter another number*/
                return "Number guessed is more than original number";
            }
            else {

                  /*if input is less than original number then below line prints.
                  and asks the user to enter another number*/
                return "Number guessed is less than original number";
            }
        }
    }
