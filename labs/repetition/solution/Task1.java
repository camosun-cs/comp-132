import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many sides?");
		int sides = in.nextInt();

		double angleBetweenPoints = 2 * Math.PI / sides;
		for (int point = 0; point < sides; point++) {
			double x = Math.cos(point * angleBetweenPoints);
			double y = Math.sin(point * angleBetweenPoints);
			System.out.printf("(%f, %f)\n", x, y);
		}
	}
}
