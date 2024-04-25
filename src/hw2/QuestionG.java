package hw2;

public class QuestionG {
	public static void main(String[] args) {
		// 請設計一隻Java程式，輸出結果為以下A-FFFFFFF升冪
		int c, d;
		for (c = 1; c <= 6; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print((char) (64 + c));

			}
			System.out.println();
		}

	}

}
