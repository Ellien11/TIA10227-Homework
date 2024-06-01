package hw5;

public class QuestionB {
	// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void main(String[] args) {
		System.out.println("本次亂數結果: ");
		randAvg();
	}

	public static void randAvg() {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			int b = (int) (Math.random() * 101);
			System.out.print(b + " ");
			total += b;
		}
		System.out.println();
		System.out.println("平均值為 " + (total / 10));

	}
}
