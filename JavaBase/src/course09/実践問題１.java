package course09;

import java.util.Scanner;

public class 実践問題１ {

	public static void main(String[] args) {
		System.out.println("誕生日を入力してね。");
		Scanner stdIn = new Scanner(System.in); 
		int num =stdIn.nextInt();
	switch(num) {
	case 1:
	case 2:
	case 3:
		System.out.println("大吉");
		break;
	case 4:
	case 5:
	case 6:
	    System.out.println("中吉");
	    break;
	case 7:
	case 8:
	case 9:
		System.out.println("小吉");
	    break;
	case 10:
	case 11:
	case 12:
		System.out.println("大凶");
	    break;
	default:
		System.out.println("該当なし");
	}
	}
}
