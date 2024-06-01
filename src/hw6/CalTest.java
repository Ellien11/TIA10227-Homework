package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		System.out.println("請輸入x的值");
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		try {
			x = sc.nextInt();
			System.out.println("請輸入y的值");
			y = sc.nextInt();
		} catch (Exception e) {
			System.out.println("輸入格式不正確");
			return;
		}

		Calculator calculator = new Calculator();
		try {
			System.out.println("x的y次方為 " + calculator.PowerXY(x, y));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
