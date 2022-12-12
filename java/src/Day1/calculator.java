package Day1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

				Scanner num = new Scanner(System.in);
				System.out.println("Enter the first number: ");
				int a = num.nextInt();

				System.out.println("Enter the Second number: ");
				int b = num.nextInt();

				System.out.println("Enter an operator (+, -, *, /): ");
				char function = num.next().charAt(0);
				int output;

				switch (function) {
				case '+':
					output = a + b;
					break;
				case '-':
					output = a - b;
					break;
				case '*':
					output = a * b;
					break;
				case '/':
					output = a / b;
					break;
				default:
					System.out.println("Error!!!!");
					return;
				}
				System.out.println("The Result for:" + a + function + b + " = " + output);

	}

}
