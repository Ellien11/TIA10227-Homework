package hw2;

public class QuestionA {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i, count = 0;
		for (i = 2; i <= 1000; i++) {
			if (i % 2 == 0) {
				count += i;
			}

		}
		System.out.println("1-1000的偶數和=" + count);
	}

}
