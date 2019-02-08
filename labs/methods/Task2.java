
package var_and_op;

import java.util.Scanner;

/**
 *
 * @author shohreh
 */
public class Task2 {

   
    public static void main(String[] args) {
        
        
	/*declare all necessary variables */

	Scanner input = new Scanner(System.in);
   	double money;
        int cents;
	int dollar, quarters , dimes, nickels , pennies; 
        int remainder;
        
        /* initialize */
        
        System.out.println("How much money do you have?");
	money = input.nextDouble();
       
         /* calculate the change */ 
        cents = (int)(money*100);
        
        dollar = cents / 100;
        remainder = cents % 100;

        quarters = remainder / 25;
        remainder = remainder % 25;

        dimes = remainder/ 10;
        remainder = remainder% 10;

        nickels = remainder/ 5;
        pennies = remainder % 5;
        
        /* This will output the different monetary units from the initial 
        user money input.
        */
	
	System.out.printf("You asked to change $%,.2f dollars \n", money);
        System.out.printf("Your change is: \n");
	System.out.print(dollar +" dollars \n");
	System.out.print(quarters + " quarters \n");
	System.out.print(dimes+" dimes \n");
	System.out.print(nickels+" nickels \n");
	System.out.print(pennies +" pennies \n");
        
        
        
        
    }// end of main
    
}// end of class Task2
        
        