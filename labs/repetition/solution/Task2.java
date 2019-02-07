import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int sides;
			while (true) {
				System.out.println("How many sides?");
				if (!in.hasNextInt()) {
					System.out.println("Please enter an integer.");
					in.nextLine();
				} else {
					sides = in.nextInt();
					in.nextLine();
					if (sides < 3) {
						System.out.println("Must have 3 or more sides.");
					} else {
						break;
					}
				}
			}

			double angleBetweenPoints = 2 * Math.PI / sides;
			for (int point = 0; point < sides; point++) {
				double x = Math.cos(point * angleBetweenPoints);
				double y = Math.sin(point * angleBetweenPoints);
				System.out.printf("(%f, %f)\n", x, y);
			}

			System.out.println("Solve another? [Y/n]");
			String response = in.nextLine();
			if (response.startsWith("n")) {
				break;
			}
		}
	}
}
