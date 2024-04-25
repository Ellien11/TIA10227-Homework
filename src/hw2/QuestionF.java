package hw2;

public class QuestionF {
	public static void main(String[] args) {
		// 請設計一隻Java程式，輸出結果為以下：(降冪1-10)
		int a, b;
		for (a = 10; a >= 0; a--) {
			for (b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

}
