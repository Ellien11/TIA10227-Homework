package hw3;

import java.util.Scanner;

public class QuestionB {
	// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果
	public static void main(String[] args) {
		int random = (int) (Math.random() * 10);
		boolean b1 = true;
		while (b1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("input numbers");
			int i = sc.nextInt();
			if (random != i) {
				System.out.println("猜錯囉!");

			} else {
				System.out.println("猜對囉");
				b1 = false;
			}

		}
	}

}
