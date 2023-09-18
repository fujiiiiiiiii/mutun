package course28;

public class Sample01 {

	public static void main(String[] args) {

		//インスタンス
		//「hu1」はHumanのインスタンス（実態）
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);

		//Chrクラスのインタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		Chr numata = new Chr();
		numata.attack = 300;
		numata.def = 100;
		numata.spd = 0;
		numata.love = 0;
		numata.mp = 50;
		numata.hp = 50;

		Chr kajima = new Chr();
		kajima.attack = 150;
		kajima.def = 150;
		kajima.spd = 200;
		kajima.love = 40;
		kajima.mp = 30;
		kajima.hp = 30;

		kajima.naguru(kajima.attack, numata.def);
	}
}
