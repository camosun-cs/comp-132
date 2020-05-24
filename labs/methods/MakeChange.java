package examples;

import java.util.Scanner;

public class MakeChange {
    public static void main(String[] args) {
        // declare variables
        final int CENTS_PER_DOLLAR = 100;
        final int CENTS_PER_QUARTER = 25;
        final int CENTS_PER_DIME = 10;
        final int CENTS_PER_NICKEL = 5;
        Scanner input = new Scanner(System.in);
        double money;
        int dollars, quarters, dimes, nickels, pennies;
        int remainder;

        // get input
        System.out.print("How much money do you have? ");
        money = input.nextDouble();

        // calculations
        remainder = (int)(money * CENTS_PER_DOLLAR);

        dollars = remainder / CENTS_PER_DOLLAR;
        remainder %= CENTS_PER_DOLLAR;

        quarters = remainder / CENTS_PER_QUARTER;
        remainder %= CENTS_PER_QUARTER;

        dimes = remainder / CENTS_PER_DIME;
        remainder %= CENTS_PER_DIME;

        nickels = remainder / CENTS_PER_NICKEL;
        remainder %= CENTS_PER_NICKEL;

        pennies = remainder;

        // output
        System.out.println("Your change is:");
        System.out.println(" • " + dollars + " dollars");
        System.out.println(" • " + quarters + " quarters");
        System.out.println(" • " + dimes + " dimes");
        System.out.println(" • " + nickels + " nickels");
        System.out.println(" • " + pennies + " pennies");

    }// end of main
}// end of class Task2
