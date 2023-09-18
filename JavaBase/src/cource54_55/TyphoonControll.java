package cource54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		System.out.println("モード入力してね。");
		System.out.println("0.そのまま　99.編集");
		int x = stdin.nextInt();

		Typhoon a = new Typhoon("1号", "2022年4月8日", "マラカス");
		Typhoon b = new Typhoon("2号", "2022年4月10日", "メーギー");
		Typhoon c = new Typhoon("3号", "2022年6月30日", "チャバ");
		Typhoon d = new Typhoon("4号", "2022年7月1日", "アイレー");
		Typhoon e = new Typhoon("5号", "2022年7月28日", "ソングダー");
		Typhoon f = new Typhoon("6号", "2022年7月31日", "トローセス");
		Typhoon g = new Typhoon("7号", "2022年8月9日", "ムーラン");
		Typhoon h = new Typhoon("8号", "2022年8月12日", "メアリー");
		Typhoon i = new Typhoon("9号", "2022年8月22日", "マーゴン");

		Typhoon[] typhoonList = new Typhoon[9];

		typhoonList[0] = a;
		typhoonList[1] = b;
		typhoonList[2] = c;
		typhoonList[3] = d;
		typhoonList[4] = e;
		typhoonList[5] = f;
		typhoonList[6] = g;
		typhoonList[7] = h;
		typhoonList[8] = i;

		if (x == 0) {
			for (int t = 0; t < 9; t++) {
				System.out.println(typhoonList[t].getTyphoonbango() + typhoonList[t].getHasseibi() + typhoonList[t].getAsiaName());
			}

			if (x == 99) {
				System.out.println("どこを変えますか");
　　　　　　
				
				
			}

		}
	}
}
