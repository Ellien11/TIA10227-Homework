package hw3;

import java.util.Scanner;

public class QuestionC {
	/*
	 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
	 * 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，如圖：
	 */

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
