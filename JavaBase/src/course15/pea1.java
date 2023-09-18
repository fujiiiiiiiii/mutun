package course15;

import java.util.Random;
import java.util.Scanner;

public class pea1 {

	public static void main(String[] args) {
		int i = 10000;
		while (i > 0 && i < 50000) {
			Scanner kakekinn = new Scanner(System.in);
			System.out.println("掛け金をいれてね。");
			int a = kakekinn.nextInt();
			Random rnd = new Random();

			int num1 = rnd.nextInt(7) + 1;
			int num2 = rnd.nextInt(7) + 1;
			int num3 = rnd.nextInt(7) + 1;
			System.out.println(num1 + "" + num2 + "" + num3);
			if (num1 == 1 && num2 == 1 && num3 == 1) {
				System.out.println("1,1,1 5倍");
				i = i + a * 5;
			} else if (num1 == 2 && num2 == 2 && num3 == 2) {
				System.out.println("2,2,2 3倍");
				i = i + a * 3;
			} else if (num1 == 3 && num2 == 3 && num3 == 3) {
				System.out.println("3,3,3 3倍");
				i = i + a * 3;
			} else if (num1 == 4 && num2 == 4 && num3 == 4) {
				System.out.println("4,4,4 3倍");
				i = i + a * 3;
			} else if (num1 == 5 && num2 == 5 && num3 == 5) {
				System.out.println("5,5,5 3倍");
				i = i + a * 3;
			} else if (num1 == 6 && num2 == 6 && num3 == 6) {
				System.out.println("6,6,6 3倍");
				i = i + a * 3;
			} else if (num1 == 4 && num2 == 5 && num3 == 6) {
				System.out.println("4,5,6 2倍");
				i = i + a * 2;
			} else if (num1 == 4 && num2 == 6 && num3 == 5) {
				System.out.println("4,6,5 2倍");
				i = i + a * 2;
			} else if (num1 == 5 && num2 == 6 && num3 == 4) {
				System.out.println("5,6,4 2倍");
				i = i + a * 2;
			} else if (num1 == 5 && num2 == 4 && num3 == 6) {
				System.out.println("5,4,6 2倍");
				i = i + a * 2;
			} else if (num1 == 6 && num2 == 4 && num3 == 5) {
				System.out.println("6,4,5 2倍");
				i = i + a * 2;
			} else if (num1 == 6 && num2 == 5 && num3 == 4) {
				System.out.println("6,5,4 2倍");
				i = i + a * 2;
			} else if (num1 == 1 && num2 == 1 && num3 == 2) {
				System.out.println("1,1,2 そのまま");
				a = 0;
			} else if (num1 == 1 && num2 == 1 && num3 == 3) {
				System.out.println("1,1,3 そのまま");
				a = 0;
			} else if (num1 == 1 && num2 == 1 && num3 == 4) {
				System.out.println("1,1,4 そのまま");
				a = 0;
			} else if (num1 == 1 & num2 == 1 && num3 == 5) {
				System.out.println("1,1,5 そのまま");
				a = 0;
			} else if (num1 == 1 && num2 == 1 && num3 == 6) {
				System.out.println("1,1,6 そのまま");
				a = 0;
			} else if (num1 == 2 && num2 == 2 && num3 == 6) {
				System.out.println("2,2,6 そのまま");
				a = 0;
			} else if (num1 == 2 && num2 == 2 && num3 == 5) {
				System.out.println("2,2,5 そのまま");
				a = 0;
			} else if (num1 == 2 && num2 == 2 && num3 == 4) {
				System.out.println("2,2,4 そのまま");
				a = 0;
			} else if (num1 == 2 && num2 == 2 && num3 == 3) {
				System.out.println("2,2,3 そのまま");
				a = 0;
			} else if (num1 == 3 && num2 == 3 && num3 == 1) {
				System.out.println("3,3,1 そのまま");
				a = 0;
			} else if (num1 == 3 && num2 == 3 && num3 == 2) {
				System.out.println("3,3,2 そのまま");
				a = 0;
			} else if (num1 == 3 && num2 == 3 && num3 == 4) {
				System.out.println("3,3,4 そのまま");
				a = 0;
			} else if (num1 == 3 && num2 == 3 && num3 == 5) {
				System.out.println("3,3,5 そのまま");
				a = 0;
			} else if (num1 == 3 && num2 == 3 && num3 == 6) {
				System.out.println("3,3,6 そのまま");
				a = 0;
			} else if (num1 == 4 && num2 == 4 && num3 == 1) {
				System.out.println("4,4,1 そのまま");
				a = 0;
			} else if (num1 == 4 && num2 == 4 && num3 == 2) {
				System.out.println("4,4,2 そのまま");
				a = 0;
			} else if (num1 == 4 && num2 == 4 && num3 == 3) {
				System.out.println("4,4,3 そのまま");
				a = 0;
			} else if (num1 == 4 && num2 == 4 && num3 == 5) {
				System.out.println("4,4,5 そのまま");
				a = 0;
			} else if (num1 == 4 && num2 == 4 && num3 == 6) {
				System.out.println("4,4,6 そのまま");
				a = 0;
			} else if (num1 == 5 && num2 == 5 && num3 == 1) {
				System.out.println("5,5,1 そのまま");
				a = 0;
			} else if (num1 == 5 && num2 == 5 && num3 == 2) {
				System.out.println("5,5,2 そのまま");
				a = 0;
			} else if (num1 == 5 && num2 == 5 && num3 == 3) {
				System.out.println("5,5,3 そのまま");
				a = 0;
			} else if (num1 == 5 && num2 == 5 && num3 == 4) {
				System.out.println("5,5,4 そのまま");
				a = 0;
			} else if (num1 == 5 && num2 == 5 && num3 == 6) {
				System.out.println("5,5,6 そのまま");
				a = 0;
			} else if (num1 == 6 && num2 == 6 && num3 == 1) {
				System.out.println("6,6,1 そのまま");
				a = 0;
			} else if (num1 == 6 && num2 == 6 && num3 == 2) {
				System.out.println("6,6,2 そのまま");
				a = 0;
			} else if (num1 == 6 && num2 == 6 && num3 == 3) {
				System.out.println("6,6,3 そのまま");
				a = 0;
			} else if (num1 == 6 && num2 == 6 && num3 == 4) {
				System.out.println("6,6,4 そのまま");
				a = 0;
			} else if (num1 == 6 && num2 == 6 && num3 == 5) {
				System.out.println("6,6,5 そのまま");
				a = 0;
			} else if (num1 == 2 && num2 == 2 && num3 == 1) {
				System.out.println("2,2,1 そのまま");
				a = 0;
			} else if (num1 == 1 && num2 == 1 && num3 == 7) {
				System.out.println("1,1,7 出した分払う");
				i = i - a;
			} else if (num1 == 2 && num2 == 2 && num3 == 7) {
				System.out.println("2,2,7 出した分払う");
				i = i - a;
			} else if (num1 == 3 && num2 == 3 && num3 == 7) {
				System.out.println("3,3,7 出した分払う");
				i = i - a;
			} else if (num1 == 4 && num2 == 4 && num3 == 7) {
				System.out.println("4,4,7 出した分払う");
				i = i - a;
			} else if (num1 == 5 && num2 == 5 && num3 == 7) {
				System.out.println("7,7,7 出した分払う");
				i = i - a;
			} else if (num1 == 6 && num2 == 6 && num3 == 7) {
				System.out.println("6,6,7 出した分払う");
				i = i - a;
			} else if (num1 == 7 && num2 == 7 && num3 == 7) {
				System.out.println("7,7,7 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 1) {
				System.out.println("7,7,1 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 2) {
				System.out.println("7,7,2 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 3) {
				System.out.println("7,7,3 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 4) {
				System.out.println("7,7,4 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 5) {
				System.out.println("7,7,5 出した分払う");
				i = i - a;
				System.out.println(i);
			} else if (num1 == 7 && num2 == 7 && num3 == 6) {
				System.out.println("7,7,6 出した分払う");
				i = i - a;
				System.out.println(i);
			} else
				System.out.println("出した分払う");
			i = i - a;
			System.out.println(i);
		}
		if (i <= 0) {
			System.out.println("1050年地下行き");
		} else {
			System.out.println("ゲームクリア");
		}
	}
}
