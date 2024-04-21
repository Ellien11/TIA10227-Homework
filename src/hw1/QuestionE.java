package hw1;

public class QuestionE {
	public static void main(String[] args) {
		double rate = 1;
		for(int i = 1; i <= 10; i++) {
			rate = rate * 1.02;
			
		}		
		System.out.println(rate * 150);
	}
}
