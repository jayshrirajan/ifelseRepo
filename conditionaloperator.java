package ifelse;

import java.util.Scanner;

public class conditionaloperator {
	public static void main(String args[]) {
		int num;    // holds value of integer

	     
	      Scanner console = new Scanner(System.in);

	      
	      System.out.print("Enter integer : ");
	      num = console.nextInt();

	     
	      num = (num < 0) ? -num : num;
	      
	      System.out.println("Absolute value is " + num);
		
	}

}
//When Java evaluates this assignment expression, it first looks at the expression to the left of the question mark. 
//If number1 is greater than number2, then the expression between the question mark and the colon is evaluated and 
//used as the value of the entire ? expression. If number2 is greater, then the expression after the colon is evaluated and used for the value of the entire ? expression. The result produced by the ? operator is then assigned to max.
//
//Here is a program that demonstrates the ? operator. It uses it to obtain the absolute value of a variable.