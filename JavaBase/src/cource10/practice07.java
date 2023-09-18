package cource10;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int num = a % 2;
		if (num == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

	}

}
