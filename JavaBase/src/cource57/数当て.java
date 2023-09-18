package cource57;

import java.util.Random;
import java.util.Scanner;

public class 数当て {

	public static void main(String[] args) {
		Random ra = new Random();
		Scanner su = new Scanner(System.in);
		int ransu = ra.nextInt(100) + 1;
		int yuzer = su.nextInt();
		int i = 0;
		System.out.println("数値を当ててみてね");
		while(ransu != yuzer) {
			
		if (ransu == yuzer) {
			
		System.out.println("おめでとう！！答えは");
        System.out.println("君は"+i+"回目で当たったよ");
			
		}
		else if(ransu > yuzer) {
			System.out.println("答えはもっと大きいよ");
			
			
	}
		else if(ransu <yuzer) {
			System.out.println("答えはもっと少ないよ");
		}
		
	}
		
	}
	}


