package cource54_55;

public class BookControll {

	public static void main(String[] args) {
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;

		System.out.println(arr[3]);

		Book book1 = new Book("明解java", 1500);
		Book book2 = new Book("確かな力が見につくｃ", 2800);
		Book book3 = new Book("30時間でマスター", 1200);
		Book book4 = new Book("ITパスポート試験", 2500);

		System.out.println(book1.getPrice());

		Book[] hondana = new Book[4];
		hondana[0] = book1;
	}

}
