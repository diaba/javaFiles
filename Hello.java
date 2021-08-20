package Lesson1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Substraction");
		substraction();
	}

	public static void substraction() {
		// Number of question
		final int NUMBERQUESTIONS = 5;
		int index = 0;
		// number of success
		int success = 0;
		long startTime = System.currentTimeMillis();

		while (index < NUMBERQUESTIONS) {

			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			int temp;
			if (num1 < num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.println("What is " + num1 + " - " + num2);
			Scanner input = new Scanner(System.in);
			int result = input.nextInt();
			if (result == num1 - num2) {
				System.out.println("Correct");
				success++;
			} else {
				System.out.println("Incorrect");
			}
			index++;
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct answer is: "+success+" time: "+ testTime);
	}

}
