import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("How many rows?");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = (rows - i); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
