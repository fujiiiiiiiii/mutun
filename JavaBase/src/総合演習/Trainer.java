package 総合演習;

import java.util.Random;

public class Trainer {
	static int kazu = 0;
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {

		Random ka = new Random();
		int x = ka.nextInt(10) + 1;

		if (x > pocke.diffcult) {
			myPockes[kazu] = pocke;
			pocke.getted = ++kazu;

		} else {
			System.out.println("捕獲失敗");
		}

	}

	void display() {
		try {
			System.out.println(myPockes[0].name);
			System.out.println(myPockes[1].name);
			System.out.println(myPockes[2].name);
			System.out.println(myPockes[3].name);
			System.out.println(myPockes[4].name);
			System.out.println(myPockes[5].name);
		} catch (Exception e) {

		}

	}
}
