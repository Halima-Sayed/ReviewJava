package review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        /*
        You need to ask user to enter numbers 1 by 1 until user enters not integer value - then loop should stop.
        Inside loop we need to calculate the sum of all entered numbers.
         */

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter integer values");

        while (scan.hasNextInt()) {

            int num = scan.nextInt();

            sum += num; // <- same as -> sum=sum+num;

        }
        System.out.println("Sum ="+ sum);
    }
}
