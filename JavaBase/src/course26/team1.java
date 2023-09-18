package course26;

public class team1 {

	public static void main(String[] args) {
		dispResult(10,29,30);
		
		static void dispResult(int a, int b, int c) {

			System.out.println("あなたの勝利数は" + a + "です。");
			System.out.println("あなたの敗北数は" + b + "です。");
			System.out.println("あなたのゲーム数は" + c + "です。");
		}
		int f = syouritu(10,6);
		System.out.println(f);
	}
		static int syouritu(int x, int y) {
			int num = x * y;
					return num;
		}
	int gemecount = 0;
	int wincount = 0;
	}