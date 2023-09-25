package ifelse;

import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		int day;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number 1-7:");
		day = s.nextInt();
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
			break;
			default :
				System.out.println("invalid input");
		}
	}

}
