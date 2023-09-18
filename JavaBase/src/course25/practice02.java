package course25;

public class practice02 {

	public static void main(String[] args) {
		String z = modoriTwo("文字！");
		System.out.println(z);
	}

	static String modoriTwo(String x) {
		String moji = x + "を受け取りました。";
		return moji;
	}
}
