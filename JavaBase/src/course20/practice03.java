package course20;

public class practice03 {

	public static void main(String[] args) {
		int[] suuti = new int[5];
		suuti[0] = 10;
		suuti[1] = 20;
		suuti[2] = 30;
		suuti[3] = 40;
		suuti[4] = 50;

		int sum = 0;
		for (int i = 0; i < suuti.length; i++) {
			System.out.println(i + "の中身は" + suuti[i] + "です");
			sum = sum + suuti[i];
		}
		System.out.println(sum);

	}
}