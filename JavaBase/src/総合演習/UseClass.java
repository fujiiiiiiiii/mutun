package 総合演習;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {

		Trainer tore = new Trainer();
		Scanner stdin = new Scanner(System.in);
		int x;
		do {

			System.out.println("メニューを選択してね");
			System.out.println("1・・・捕獲");
			System.out.println("2・・・図鑑を見る");
			System.out.println("3・・・バトル");
			System.out.println("99・・・プログラム終了");

			x = stdin.nextInt();
			if (x == 1) {
				Pocketon poke = new Pocketon("", "", 0, 0);
                System.out.println("名前を入力してね");
				poke.name = stdin.next();
				System.out.println("タイプを入力してね");
				poke.type = stdin.next();
				System.out.println("攻撃力を入力してね");
				poke.power = stdin.nextInt();
				System.out.println("難易度を入力してね");
				poke.diffcult = stdin.nextInt();
				
				tore.capture(poke);
				tore.display();
			}
			if (x == 2) {
				tore.display();
			}
			if (x == 3) {

				try {

					String a = stdin.next();
					int i = 0;
					for (i = 0; (!(a.equals(tore.myPockes[i].name))) && i < 5; i++) {

					}
					Pocketon p = tore.myPockes[i];

					String b = stdin.next();
					int e = 0;
					for (e = 0; (!(a.equals(tore.myPockes[i].name))) && i < 5; i++) {

					}
					Pocketon d = tore.myPockes[i];

					Battle bato = new Battle();
					bato.doBattle(p, d);
				} catch (Exception e) {

				}
			}
		} while (x != 99);

	}
}
