package course29;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Character me = new Character();

		me.name = "ふじさん";
		me.hp = 90;
		me.str = 30;
		me.dex = 50;
		me.agi = 300;
		me.def = 90;

		me.viewStatus();

		Character tonari = new Character();

		tonari.name = "いのしし";
		tonari.hp = 100;
		tonari.str = 250;
		tonari.dex = 100;
		tonari.agi = 50;
		tonari.def = 50;

		tonari.viewStatus();

		me.battle(me, tonari);
		
		Character me = new Character();

		System.out.println("プレイヤー１のパラメータを入力してね");

		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は？");
		me.name = stdIn.next();

		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃は？");
		me.str = stdIn.nextInt();
		System.out.println("dexは？");
		me.dex = stdIn.nextInt();
		System.out.println("agiは？");
		me.agi = stdIn.nextInt();
		System.out.println("防御は？");
		me.def = stdIn.nextInt();

		me.viewStatus();