package course22;

public class Sample01 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		arr[1][0] = 70;
		arr[1][1] = 80;
		arr[1][2] = 90;

		//ちなみに、こうも書ける

		String[][] arr2 = { { "あ", "い", "う" }, { "か", "き", "く" }, { "さ", "し", "す" } };

		System.out.println(arr[1][0]);

	}

}
