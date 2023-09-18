package course13;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		System.out.println("数字を入力してね。");
		Scanner stdIn = new Scanner(System.in);
		int yy = stdIn.nextInt();
		for (int y = 1; y <=yy; y++) {
			System.out.println(y);
			int x = y%2;
			if(x==1) {
				System.out.println("奇数だよ");
			}
			if(x==0) {
				System.out.println("偶数だよ");
			}
			if(x>=100) {
				System.out.println("どれだけ回すの");
			}
			

		}
	}
}
