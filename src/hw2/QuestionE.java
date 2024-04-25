package hw2;

public class QuestionE {
	public static void main(String[] args) {
		// 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		// 請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int num = 1;
		int total = 0;
		for (num = 1; num <= 49; num++) {
			if (num % 10 != 4 && num < 40) {
				System.out.print(num + " ");
				total++;
			}

		}
		System.out.println();
		System.out.println("共" + total + "個");

	}

}
