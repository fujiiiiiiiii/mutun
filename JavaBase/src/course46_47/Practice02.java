package course46_47;

public class Practice02 {

	public static void main(String[] args) {
		try {
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("これはエラーです。");
			System.out.println(e);
		}
	}

}
