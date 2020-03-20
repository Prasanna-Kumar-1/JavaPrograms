import java.util.Scanner;

public class SumOfAllDigits 
{

	public static void main(String args[])
	{ 

		int inputNumber, Temp, sum = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number: ");
		inputNumber = s.nextInt();

		while(inputNumber > 0)
		{ 
			Temp = inputNumber % 10;
			sum = sum + Temp;
			inputNumber = inputNumber / 10;
		}
		System.out.println("Sum of Digits is: " + sum);
	}
}
