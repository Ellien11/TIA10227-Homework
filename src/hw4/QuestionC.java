package hw4;

public class QuestionC {
	public static void main(String[] args) {
		String[] p8 = {"mercury", "venus", "earth","mars", "jupiter", "saturn", "uranus", "neptune"};
		 int aeiou=0;
		 for (int i =0; i<p8.length; i++) {
			 for(int j =0; j<p8[i].length(); j++) {
				switch (p8[i].charAt(j)) {
				case 'a': {
					aeiou++;
				}
				case 'e':{
					aeiou++;
				}
				case 'i':{
					aeiou++;
				}
				case 'o':{
					aeiou++;
				}
				case 'u':{
					aeiou++;
				}
					
		
				}
			 }
			 
		 }
		 System.out.println("總共有 " + aeiou + " 個母音");
		
		
	}

}
