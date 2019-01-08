
/*
 * This program demonstrates the use of a method to determine which number is 
greater, given 2 number
 */
import java.util.Scanner;

public class TestMax_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1;
        int number2;
        int max1;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = input.nextInt();
        max1= max(number1,number2);
        System.out.print("The Max number is "+ max1);
    }
    
    public static int max(int num1, int num2){
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}
