package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionB {
	/*
	 * 請寫一隻程式，能夠亂數產生10個1～1000的整數， 並寫入一個名為Data.txt的檔案裡(請使用append功能讓每次執行結果都能被保存起來)
	 */
	public static void main(String[] args) {
		File f = new File("C:\\Users\\T14 Gen 3\\Desktop\\JAVA\\hw\\hw7" + "\\Data.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			for (int i = 0; i < 10; i++) {
				int ran = (int) (Math.random() * 1000 + 1); // 1-1000
				fw.append(String.valueOf(ran));
				fw.append(System.lineSeparator());
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
