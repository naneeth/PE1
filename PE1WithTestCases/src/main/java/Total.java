/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class reads an unspecified number of integer arguments using Scanner Class and adds them together
 *till u enter non integer input
 * @version 1.10 31-Dec-2018
 *
 * @author Akuthota Naneeth
 */
public class Total {
    public static void main(String[] args) {
        int     sum  = 0;
        Scanner scan = new Scanner(System.in);
        boolean   k  = false;
        while(scan.hasNext()){
            if(scan.hasNextInt())
                sum = sum + scan.nextInt();
            else
            {
                k = true;
                break;
            }
        }
        if(k) {
            System.out.println("error you have not entered integer");
                System.out.print("Sum till now is:" + sum);

        }
    }
}