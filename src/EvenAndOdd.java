/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class take one number between 20 and 30 as input from user.
 *The output tells us whether the input is even or odd.
 *
 * @version 1.10 31-Dec-2018
 *
 * @author Akuthota Naneeth
 */
public class EvenAndOdd {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.print("Enter a number between 20 & 30:");

        /*next line takes an int between 20 and 30  as input*/
        int     second = scan.nextInt();
        if(20<second){
            if(second<30){
                if(second%2==0){
                    System.out.print("Jerry");
                }
                else{
                    System.out.print("Tom");
                }
            }
        }
    }
}