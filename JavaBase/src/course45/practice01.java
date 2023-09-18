package course45;

public class practice01 {

	public static void main(String[] args) {
		int[] numExArr = new int[5];

		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;

		int x = numExArr[0];
		numExArr[4] = x;
		System.out.println(numExArr[4]);

	}
}