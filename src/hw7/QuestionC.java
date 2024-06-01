package hw7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionC {
	public static void copyFile(String inputFile, String outputfile) throws IOException{
		FileReader i = new FileReader(inputFile);
		FileWriter o = new FileWriter(outputfile);
		
		int a;
		while ((a=i.read())!= -1) {
			o.write(a);
			o.flush();
			
		}
		i.close();
		o.close();
	}
	public static void main(String[] args) {
		try {
			copyFile("C:\\Users\\T14 Gen 3\\Desktop\\JAVA\\hw\\hw7" + "\\Data.txt", "C:\\Users\\T14 Gen 3\\Desktop\\JAVA\\hw\\hw7" + "\\Data2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
