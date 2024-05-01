package hw3;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
		int i = sc.nextInt();
		int num = 1;
		int total = 0;
		for (num = 1; num <= 49; num++) {
			if (num % 10 != i && num / 10 != i) {
				System.out.print(num + "   ");
				total++;
				if (total % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("總共" + total + "個數字可選");
	}
}
