package hw2;

public class QuestionB {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int j, sum = 1;
		for (j = 1; j <= 10; j++) {
			sum *= j;

		}
		System.out.println("1-10連積乘" + sum);
	}

}
