package cource10;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println("xがでかい！");
		} else {

			if (x == y) {
				System.out.println("同じ");
			} else {
				System.out.println("yがでかい！");
			}
		}
	}
}
