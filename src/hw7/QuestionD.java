package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class QuestionD {
		public static void main(String[] args) throws Exception {
		File file = new File("c:\\data");
		if (!file.exists()) {
			file.mkdir();
		}
		FileOutputStream ouf = new FileOutputStream("c:\\data\\Object.ser");
		BufferedOutputStream bfw = new BufferedOutputStream(ouf);
		ObjectOutputStream obo = new ObjectOutputStream(bfw);

		Animal c1 = new Cat("c1");
		Animal d1 = new Dog("d1");

		
		obo.writeObject(c1);
		obo.writeObject(d1);

		
		obo.close();
		bfw.close();
		ouf.close();

		;
	}
}
