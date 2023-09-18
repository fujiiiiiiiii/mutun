package cource57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner std = new Scanner(System.in);
		Player me = new Player();

		int p1 = ran.nextInt(5) + 1;
		int p2 = ran.nextInt(5) + 1;
		int p3 = ran.nextInt(5) + 1;
		int p4 = ran.nextInt(5) + 1;
		int t1 = ran.nextInt(11) + 3;
		int t2 = ran.nextInt(11) + 3;
		int t3 = ran.nextInt(11) + 3;
		int t4 = ran.nextInt(11) + 3;
		me.setKinryoku(p1);
		me.setGakuryoku(p2);
		me.setMitame(p3);
		me.setOmosiro(p4);

		Target koku = new Target();

		koku.setHituyouKin(t1);
		koku.setHituyouGaku(t2);
		koku.setHituyouOmo(t3);
		koku.setHituyouMita(t4);
		System.out.println("現在のパラメータ");
		me.display();

		System.out.println("あの子に告白するために自分磨きをしよう");
		System.out.println("まずは何をする？");
		System.out.println("1.筋トレ　2.勉強");
		System.out.println("3.整形　4.人としゃべる");
		System.out.println("");

		
		for (int i = 0; i < 7; i++) {
			
			
			int x = std.nextInt();

			if (x == 1) {
				p1 = p1 + 1;
				me.setKinryoku(p1);
				System.out.println("筋力が" + (me.getKinryoku()) + "に上がった");

			} else if (x == 2) {
				p2 = p2 + 1;
				me.setGakuryoku(p2);
				System.out.println("学力が" + (me.getGakuryoku()) + "に上がった");

			} else if (x == 3) {
				p3 = p3 + 1;
				me.setMitame(p3);
				System.out.println("見た目が" + (me.getMitame()) + "に上がった");

			} else if (x == 4) {
				p4 = p4 + 1;
				me.setOmosiro(p4);
				System.out.println("面白さが" + (me.getMitame()) + "に上がった");
			}}
			int y = ran.nextInt(4);
			if (y == 1) {
				System.out.println(koku.getHituyouKin());
			} else if (y == 2) {
				System.out.println(koku.getHituyouGaku());
			}

			else if (y == 3) {
				System.out.println(koku.getHituyouMita());
			}

			else if (y == 4) {
				System.out.println(koku.getHituyouOmo());
			}
		
		System.out.println("チャレンジ！！能力を選んで！！");
		
	}}
