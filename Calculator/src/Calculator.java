
	import java.util.Scanner;
public class Calculator {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			double num1, num2, answer;
			System.out.println("Enter first Number:");
			num1 = input.nextDouble();
			System.out.println("Enter second Number:");
			num2 = input.nextDouble();
			answer = num1 + num2;
			System.out.println(answer);
		}
	}


