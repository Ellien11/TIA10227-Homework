package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class QuestionA {

	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/T14 Gen 3/Desktop/JAVA/hw/hw7/Sample.txt");
			String i;
			int charCount = 0;
			int line = 0;
			FileReader is = new FileReader(file);
			BufferedReader bis = new BufferedReader(is);
			while ((i = bis.readLine()) != null) {
				line++;
				charCount += i.length() +1;
			}
			System.out.println("共" + file.length() + "個位元組" + "共" + charCount + "個字元" + line + "列資料");
			bis.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	}

