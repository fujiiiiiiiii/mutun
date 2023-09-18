package course09;

import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		System.out.println("誕生日を入力してね。");
		Scanner stdIn = new Scanner(System.in); 
		int num =stdIn.nextInt();
		switch(num) {
		case 1:
			System.out.println("１月");
			break;
		case 2:
		    System.out.println("２月");
		case 3:
			System.out.println("３月");
			break;
		case 4:
			System.out.println("４月");
			break;
		case 5:
		    System.out.println("５月");
		case 6:
			System.out.println("６月");
			break;
		case 7:
		    System.out.println("７月");
		case 8:
			System.out.println("８月");
			break;
		case 9:
		    System.out.println("９月");
		case 10:
			System.out.println("１０月");
			break;
		case 11:
		    System.out.println("１１月");
		case 12:
			System.out.println("１２月");
			break;
		default:
			System.out.println("該当なし");
			
		
	

}
	}
}