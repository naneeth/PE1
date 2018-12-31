/*
 * Akuthota Naneeth,
 *
 * Stack Route,
 *
 * Boeing India Pvt Ltd.
 */
import java.util.Scanner;

/**
 * The class reads integer and sort it in non increasing order and prints the sum of even numbers.
 *
 * @version 1.10 31-Dec-2018
 * @author Akuthota Naneeth
 */
public class SortingSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to sort and find even sum");
        /* next line takes integer input in string format*/
        String s = scan.nextLine();
        int length = s.length();
        String res="";
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<length;i++)
        {
            arr[(s.charAt(i)-'0')]++;
        }
        for(int i=9;i>=0;i--)
        {
            for(int j=0;j<arr[i];j++) {
                res += (char) (i + 48);
            }
        }
        System.out.println(res);
        /* This calculates the sum of even numbers in the given number*/
        int sum = arr[2]*2 + arr[4]*4 + arr[6]*6 + arr[8]*8;
        System.out.println("Sum of even numbers is : " +sum);

        /* This checks the sum of even numbers is greater or less than 15*/
        if(sum > 15) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
