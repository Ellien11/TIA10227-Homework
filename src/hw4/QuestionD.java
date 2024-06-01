package hw4;

import java.util.Scanner;

public class QuestionD {
	/*請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事
	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 
	就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
	*/
	public static void main(String[] args) {
		int [][] w = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		Scanner sc  = new Scanner(System.in);
		System.out.println("輸入阿文欲借的金額= ");
		int input =sc.nextInt();
		System.out.print("有錢可借的員工編號= ");
		int total =0;
		for(int i = 0; i<w[1].length; i++) {
			if (w[1][i] >= input) {
				total++;
				System.out.print(w[0][i] + " " );
			}
		}
		
		System.out.println("共" + total + "人!");
		
		
		
	}

}
