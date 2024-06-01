package hw5;

import java.util.Scanner;

public class QuestionA {
	// 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬高");

//		String input = sc.next();
//		String[] str = input.split(",");
		try {
			int width = sc.nextInt();
			int height = sc.nextInt();
//			int width = Integer.valueOf(str[0]);
//			int height = Integer.valueOf(str[1]);
			starSquare(width, height);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
