package examples;
import java.util.Scanner;

/**
 * A simple example program
 * @author C0420817
 */
public class WhatsUrName {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;
		int age;
		double salary;

		System.out.println("What is your name?");
		name = input.nextLine();

		System.out.println("How old are you?");
		age = input.nextInt();

		System.out.println("How much do you make per year?");
		salary = input.nextDouble();

		System.out.println();
		System.out.println("Your name is " + name + ".");
		System.out.println("You are " + age + " years old.");
		System.out.printf("You make $%,.2f every year.\n", salary);

	}
}
