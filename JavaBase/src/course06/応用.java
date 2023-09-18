package course06;

import java.util.Scanner;

public class 応用 {

	public static void main(String[] args) {
		
	 Scanner stdIn = new Scanner(System.in);
	 
	 System.out.println("数値を入力してね");
	 int x = stdIn.nextInt();
	 
	 if (x>=10) {
		 System.out.println("入力した数値は10以上です");
	 }else {
		 System.out.println("10未満です");
	 }
	
	}

	}


