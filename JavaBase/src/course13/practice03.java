package course13;

public class practice03 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {

			int y = i % 2;
			if (i % 2 == 0 && i != 0) {
				System.out.println("偶数です。");
			}
			System.out.println(i);
		}
	}

}
