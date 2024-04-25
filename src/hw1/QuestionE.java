package hw1;

public class QuestionE {
	public static void main(String[] args) {
		// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行
		// 請用程式計算10年後，本金加利息共有多少錢用複利計算，公式請自行google
		double rate = 1;
		for (int i = 1; i <= 10; i++) {
			rate = rate * 1.02;

		}
		System.out.println(rate * 150);
	}
}
