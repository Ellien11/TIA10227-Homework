package hw5;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class QuestionE {
	// 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，
	// 當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合

	public static String getAuthCode() {
		char[] rc = new char[8]; // 建立一個char array
		Set<Integer> us = new HashSet<>(); // set裡面不會有重複
		for (int i = 0; i < 8; i++) { // 做1-8的隨機數
			int rm = (int) (Math.random() * 3); // randomNUm
			switch (rm) {
			case 0:
				rc[i] = getNum();
				break;
			case 1:
				rc[i] = getLower();
				break;
			case 2:
				rc[i] = getUpper();
			default:
				break;
			}
		}
		while (us.size() < 3) { // 用set取到3個0-7的不重複數字 並覆寫三個不同位置的char
			int randN = (int) (Math.random() * 8);
			if (us.size() == 0 && us.add(randN)) {
				rc[randN] = getNum();
			} else if (us.size() == 1 && us.add(randN)) {
				rc[randN] = getLower();
			} else if (us.add(randN)) {
				rc[randN] = getUpper();
			}
		}
		return new String(rc);

	}

	static char getNum() {
		return (char) ('0' + Math.random() * 10);
	}

	static char getLower() {
		return (char) ('a' + Math.random() * 26);
	}

	static char getUpper() {
		return (char) ('A' + Math.random() * 26);
	}

	public static void main(String[] args) {
		System.out.println(getAuthCode());
	}

}
