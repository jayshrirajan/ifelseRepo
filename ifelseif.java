package ifelse;

import java.util.Scanner;

public class ifelseif { // grade finding
	public static void main(String args[]) {
		int score;
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numeric score:");
		score = s.nextInt();
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade ='B';
		}
		else if(score>=70){
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		System.out.println("your grade is " +grade);
	}

}
