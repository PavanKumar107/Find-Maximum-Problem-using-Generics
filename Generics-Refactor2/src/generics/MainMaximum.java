package generics;

import java.util.Scanner;

public class MainMaximum {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);
		Maximum max1;

		while (true) {
			System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
			int option = scan.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter First Number: ");
				int first = scan.nextInt();
				Integer first1 = scan.nextInt();

				System.out.println("Enter Second Number: ");
				int second = scan.nextInt();
				Integer second1 = scan.nextInt();

				System.out.println("Enter Third Number: ");
				int third = scan.nextInt();
				Integer third1 = scan.nextInt();

				max1.maxInt(first1, second1, third1);
				max1 = new Maximum(third1, third1, third1);
				max1.findMax();
				break;
			}
			case 2: {
				System.out.println("Enter First Number: ");
				float first = scan.nextFloat();
				Float first1 = scan.nextFloat();

				System.out.println("Enter Second Number: ");
				float second = scan.nextFloat();
				Float second1 = scan.nextFloat();

				System.out.println("Enter Third Number: ");
				float third = scan.nextFloat();
				Float third1 = scan.nextFloat();

				max1.maxInt(first1, second1, third1);
				max1 = new Maximum(option, option, option);
				max1.findMax();
				break;
			}
			case 3: {
				System.out.println("Enter First Value: ");
				String first = scan.next();
				System.out.println("Enter Second Value: ");
				String second = scan.next();

				System.out.println("Enter Third Value: ");
				String third = scan.next();
				max1.maxString(first, second, third);

				max1 = new Maximum(third, third, third);
				max1.findMax();
				break;
			}
			default:
				System.out.println("Enter Choice between 1 to 3");
			}
		}
	}
}