package course46_47;

public class Practice01 {

	public static void main(String[] args) {
		try {
			int[] array = { 1, 2, 3 };

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);

			}
		} catch (Exception e) {
			System.out.println("これはエラーです。");
			System.out.println(e);
		}
	}
}
