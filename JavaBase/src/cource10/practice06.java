package cource10;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	
	if(x>y) {
		System.out.println("xがでかい！なぜならxは" + x + "でyは" + y  + "だから");
	}else {
		System.out.println("yがでかい！なぜならyが" + y + "でxは" + x + "だから");
	}
	
	}

}
