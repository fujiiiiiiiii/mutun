package course09;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		System.out.println("入力してね。");
		Scanner stdIn = new Scanner(System.in); 
		String like ="魚";
	switch(like) {
	case "魚":
		System.out.println("魚が好きです。");
		break;
	case "肉":
	    System.out.println("肉が好きです。");
	    break;
	default:
		System.out.println("野菜派です。");
	}
	}

}
