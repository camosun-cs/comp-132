import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find a Fibonacci number just above:");
		int max = in.nextInt();
		int previous = 0;
		int current = 1;
		do {
			int old = previous;
			previous = current;
			current = previous + old;
		} while (current <= max);
		System.out.println("Answer:");
		System.out.println(current);
	}
}

