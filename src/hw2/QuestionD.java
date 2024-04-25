package hw2;

public class QuestionD {
	public static void main(String[] args) {
		// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		int x = 1;
		for (x = 1; x <= 10; x++) {
			System.out.print(x * x + " ");

			// int x = 1, y = 1;
			// for (x = 1; y < 100; x++) {
			// y = (int) Math.pow(x, 2);
			// System.out.print(y + " ");
		}
	}

}
