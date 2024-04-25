package hw2;

public class QuestionC {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) 用while迴圈
		int k = 1, sum1 = 1;
		while (k <= 10) {
			sum1 *= k;
			k++;
		}
		System.out.println("1-10的連積乘" + sum1);
	}

}
