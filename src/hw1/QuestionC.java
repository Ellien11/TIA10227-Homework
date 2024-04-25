package hw1;

public class QuestionC {
	public static void main(String[] args) {
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int num1 = 256559;

		int days = num1 / 86400;
		int hours = (num1 % 86400) / 3600;
		int minutes = ((num1 % 86400) % 3600) / 60;
		int seconds = ((num1 % 86400) % 3600) / 60;

		System.out.println(days + "天" + hours + "時" + minutes + "分" + seconds + "秒");
	}

}
