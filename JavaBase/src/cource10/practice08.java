package cource10;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	int z = stdIn.nextInt();
	
	if(y<=x||x<=z) {
		System.out.println(x);
	}
	}

}
