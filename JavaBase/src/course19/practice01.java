package course19;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		String[] mygroup = new String[3];

		//慣れよう問題①
		mygroup[0] = "杉本";
		mygroup[1] = "大澤";
		mygroup[2] = "長縄";

		//慣れよう問題②
		int[] maygroupnum = new int[3];
		maygroupnum[0] = 13;
		maygroupnum[1] = 5;
		maygroupnum[2] = 19;

		//慣れよう問題③

		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];

		//慣れよう問題④
		int[] myNumScan = new int[3];
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を打ってね。");
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];
		System.out.println(myNumScan[2]);

	}

}
