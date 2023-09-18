package course20;

public class practice02 {

	public static void main(String[] args) {
		int[] suuti = new int[5];
		suuti[0] = 10;
		suuti[1] = 20;
		suuti[2] = 30;
		suuti[3] = 40;
		suuti[4] = 50;

		for (int i = 0; i < suuti.length; i++) {
			if (suuti[i] >= 30) {
				System.out.println(i + "番目の要素は30より大きい");
			}

		}
	}

}
