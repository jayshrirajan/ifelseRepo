package ifelse;

import java.util.Scanner;

public class logicaloperators {
	public static void main(String args[]) {
		int num1,  num2,  num3;
		int max;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three Integers:");
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		if((num1>num2)&&(num2>num3)) {
			max = num1;
		}
		else if(num2 > num3) {
			max = num2;
		}
		else {
			max = num3;
		}
		System.out.println("maximum no of integer is:" +max);
		
	}

}
