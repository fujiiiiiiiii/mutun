package course11;

import java.util.Scanner;

public class ペアプロ問題 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String x = "*";
		while(!(x.equals("*****"))){
		System.out.println(x);
		x = x + "*";
		
		}
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
	}

}
