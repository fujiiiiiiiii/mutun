package course11;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			if (i == 5)	{
				break;
			}
			i++;
		}
		System.out.println("抜けたよ");
	}
}
