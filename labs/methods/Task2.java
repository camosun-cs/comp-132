package lab5;

import java.util.Scanner;

/**
 * @author shohreh
 */
public class Task2 {
    public static void main(String[] args) {
        // declare variables
        Scanner input = new Scanner(System.in);
        double money;
        int cents;
        int dollar, quarters, dimes, nickels, pennies;
        int remainder;

        // get input
        System.out.println("How much money do you have?");
        money = input.nextDouble();

        // calculatations
        cents = (int)(money*100);
        dollar = cents / 100;
        remainder = cents % 100;
        quarters = remainder / 25;
        remainder %= 25;
        dimes = remainder / 10;
        remainder %= 10;
        nickels = remainder / 5;
        pennies = remainder % 5;

        // output
        System.out.printf("You asked to change $%,.2f dollars\n", money);
        System.out.println("Your change is:");
        System.out.println(dollar + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }// end of main
}// end of class Task2
