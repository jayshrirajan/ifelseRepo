package ifelse;

import java.util.Scanner;

public class maximumno {
	public static void main(String args[]) {
		int number1,number2;
		int max;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer:");
		number1 = s.nextInt();
		System.out.println("Enter another integer:");
		number2 = s.nextInt();
		if(number1>number2) {
			max = number1;
		}else {
			max=number2;
		}
		System.out.println("maximum no is:" +max);
	}

}
