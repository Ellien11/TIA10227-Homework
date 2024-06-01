package hw4;

public class QuestionA {

	public static void main(String[] args) {
		/*
		 * 有個一維陣列如下： {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		 */
		int[] i = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		int avg = (sum / i.length);
		System.out.println(("所有元素的平均值= " + avg));

		System.out.print("大於平均值的元素= ");
		for (int k = 0; k < i.length; k++) {
			if (i[k] > avg) {
				System.out.print(i[k] + " ");
			}

		}

	}

}
