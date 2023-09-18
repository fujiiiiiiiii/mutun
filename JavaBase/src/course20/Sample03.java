package course20;

public class Sample03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		//左側に取り出した単品
	    //右側に取り出し元の配列
		for(int num : arr) {
			sum= sum + num;
		}
		
System.out.println(sum);

	}

}