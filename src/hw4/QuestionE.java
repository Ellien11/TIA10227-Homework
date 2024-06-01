package hw4;

import java.time.LocalDate;
import java.util.Scanner;

public class QuestionE {
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	public static void main(String[] args) {
		int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy)=");
		int yy=sc.nextInt();
		System.out.println("請輸入月(mm)");
		int mm = sc.nextInt();
		System.out.println("請輸入日(dd)");
		int dd = sc.nextInt();
		try {
			LocalDate ldt = LocalDate.of(yy, mm, dd);
			System.out.println("輸入的日期為該年第" + ldt.getDayOfYear() + "天");
			
		} catch (Exception e) {
			System.out.println("輸入日期有誤");
		}
		
		
		
		
				
	}

}
