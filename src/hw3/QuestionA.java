package hw3;

 import java.util.Scanner;

public class QuestionA {
	// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果

	public static void main(String args[]) {
		function1();
	}

	private static void function1() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("input numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (x + y <= z || x + z <= y || z + y <= x || x <= 0 || y <= 0 || z <= 0) {
				System.out.println("這不是三角形");

			} else if (x == y && y == z) {
				System.out.println("正三角形");

			} else if (x == y || y == z || x == z) {
				System.out.println("等腰三角形");

			} else if (x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x) {
				System.out.println("這是直角三角形");

			} else {
				System.out.println("其他三角形");
			}
			System.out.println(x + y + z);

		}
	}

}
