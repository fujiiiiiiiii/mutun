package course19;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {

		//慣れよう問題⑤

		int numArray[] = new int[3];

		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;

		for (int i = 0; i < 3; i++) {
			System.out.println(numArray[i]);
			
			//慣れよう問題⑥
			//パターンA
			int numArray[] = new int[3];
			Scanner stdIn = new Scanner(System.in);
			int x = stdIn.nextInt();
			int[] numArray2 = new int[x];
			//パターンB
			int[] numArray2 = new int[stdIn.nextInt()];
			

			}

		}
}
