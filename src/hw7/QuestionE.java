package hw7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class QuestionE {
	public static void main(String[] args) throws Exception {
		File iFile = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(iFile);
		BufferedInputStream bfis = new BufferedInputStream(fis);
		ObjectInputStream obis = new ObjectInputStream(bfis);
		try {
			while (true) {
				((Animal) obis.readObject()).speak();
			}
		} catch (Exception e) {
			System.out.println("資料讀取完畢");
			// TODO: handle exception
		}

		obis.close();
		bfis.close();
		fis.close();
	}

}
