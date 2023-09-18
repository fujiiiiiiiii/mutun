package course49;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		
		int[][] zaseki = new int[6][6];//座席の配列作成
		int[] hantei = new int[36];//すでに選んだ出席番号を格納する配列
		int h = 0;//hantei配列の初期番号
		System.out.println("左上から順に席を決めていくよ");
		
		
		
		
		
		for (int a = 0; a < 6; a++) {//行の移動
			for (int b = 0; b < 6; b++) {//列の移動
				System.out.println("上から" + (a + 1) + ",左から" + (b + 1) + ",の出席番号を選んでね");
				int syusseki = stdIn.nextInt();//出席番号の設定
				//選んだ出席番号が1～36かを確認////////////////////////////////////////////////
				if (syusseki > 36 || syusseki < 1) {//36より大きいまたは1より小さい番号を選択したら↓
					while (syusseki > 36 || syusseki < 1) {//ループさせ出席番号を再設定
						System.out.println("1～36の間の数を選んでね");
						System.out.println("もう一度出席番号を選んでね");
						syusseki = stdIn.nextInt();//出席番号選択
					}
				}
				/////////////////////////////////////////////////////////////////////////////
				//すでに選んだ出席番号かを確認///////////////////////////////////////////////
				int d = 0;//dはhantei配列0～35と選んだ出席番号が被らなかった数
				while (d != 36) {
					d = 0;//dの初期化
					for (int c = 0; c <= 35; c++) {//選んだ出席番号がhantei配列の0～35まで
						if (syusseki != hantei[c]) {//被っていないかを確認する
							d++;//被らなかった数を1増やす
						}
					}
					if (d == 36) {//全て被っていなければ
						zaseki[a][b] = syusseki;//a行目b列目の出席番号にsyussekiを設定
						hantei[h] = syusseki;//hantei配列のh番目に選んだ出席番号を格納
						h++;//次に入れるhantei配列の番号を増やす 例）1→2
					}
					if (d != 36) {//一つでもかぶれば
						System.out.println("その出席番号はもう使ったよ");
						System.out.println("もう一度出席番号を選んでね");
						syusseki = stdIn.nextInt();//もう一度出席番号を選択
					}
				}
				///////////////////////////////////////////////////////////////////////////
			}
		}
	
		
		//座席表示/////////////////////////////////////
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				System.out.print(zaseki[a][b] + " ");
			}
			System.out.println();
		}
		///////////////////////////////////////////////
		
		int syuuryou = 0;
	while(syuuryou <= 999) {
	System.out.println("これでよろしいですか？");
	System.out.println("1.確定 2.変更");
	int k = stdIn.nextInt();
	if(k == 1) {
		
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				System.out.print(zaseki[a][b] + " ");
			}
			System.out.println();
	}
		System.out.println("終了");
		syuuryou =1000;
		}
	
	
	if(k == 2) {
		System.out.println("入れ替え元を入力してね[][]←側");
		int a1 = stdIn.nextInt();
		
		System.out.println("入れ替え元を入力してね[][]→側");
		int a2 = stdIn.nextInt();
		
		System.out.println("入れ替え先を入力してね[][]←側");
		int a3 = stdIn.nextInt();
		
		System.out.println("入れ替え先を入力してね[][]→側");
		int a4 = stdIn.nextInt();
		

		int save = 0;//空白の箱を作る
		save = zaseki[(a3-1)][(a4-1)];//空白の箱の中に入れ替え先を入れる
		zaseki[(a3-1)][(a4-1)] = zaseki[(a1-1)][(a2-1)];//空いた入れ替え先に入れ替え元を入れる
		zaseki[(a1-1)][(a2-1)] = save;//入れ替え元に保存した入れ替え先を入れる
		
	}
	}
	}
	
	}
