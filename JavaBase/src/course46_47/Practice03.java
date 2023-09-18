package course46_47;

public class Practice03 {

	public static void main(String[] args) {
		try {
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}		
		} catch (Exception e) {
			System.out.println("これはエラーです。");
			System.out.println(e);
		}
	}

}
