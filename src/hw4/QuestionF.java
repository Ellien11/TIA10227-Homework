package hw4;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class QuestionF {
//	班上有8位同學，他們進行了6次考試結果如下：請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int[][] array = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 89, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] count= {0,0,0,0,0,0,0,0};
		for (int i = 0; i < array.length; i++) {
			int high = 0;
			int cn = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > high) {
					high = array[i][j];
					cn = j;
				}
			}
			count[cn]++;
		}
		int sn = 1;
		System.out.println(Arrays.toString(count));
		for(int i:count) {
		System.out.println(sn++ + "號最高分的次數為" + i + "次");
		}
		}

	
}
