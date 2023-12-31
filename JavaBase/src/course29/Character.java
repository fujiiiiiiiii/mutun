package course29;

public class Character {
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP：" + hp);
		System.out.println("攻撃力：" + str);
		System.out.println("防御力：" + def);
		System.out.println("命中力：" + dex);
		System.out.println("回避率：" + agi);
	}

	void battle(Character me, Character tonari) {
		System.out.println(me.name + "と" + tonari.name + "の熱い戦いが始まる・・・！");

		//hpが続く限り戦いを続けるための処理
		while (me.hp > 0 && tonari.hp > 0) {

			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。

			if (me.agi >= tonari.agi) {
				tonari.hp = tonari.hp - (me.str - tonari.dex);
               tonari.agi = tonari.agi + 10;
			} else {
				me.hp = me.hp - (tonari.str - me.dex);
				me.agi = me.agi + 10;
			}
			System.out.println(me.name + "のHP" + me.hp);
			
			System.out.println(tonari.name + "のHP" + tonari.hp);
		}
		System.out.println("は死亡した。だが、皆の記憶の中で生き続ける。");

	}
}
