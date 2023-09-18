package course19;

public class Sample01 {

	public static void main(String[] args) {
		String a = "藤倉";
		String b = "杉本";
		String c = "長縄";
		String d = "大関";
		String e = "土谷";
		String f = "大澤";
		String g = "薄井";
		String h = "鹿嶋";
		System.out.println(a + b + c + d);
		System.out.println(e + f + g + h);
		
		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "藤倉";
		nameList[1] = "杉本";
		nameList[2] = "長縄";
		nameList[3] = "大関";
		nameList[4] = "土谷";
		nameList[5] = "大澤";
		nameList[6] = "薄井";
		nameList[7] = "鹿嶋";

		for (int i = 0; i < 3; i++)
			;
		System.out.println("俺の友達の名前は" + nameList[0] + "だ。");

	}

}
