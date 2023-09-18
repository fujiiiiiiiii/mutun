package course38_39;

public class UseClass {

	public static void main(String[] args) {
		/*Pocketon poke1 = new Pocketon();
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		
		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		
		Pocketon poke3 = new Pocketon();
		Scanner stdIn = new Scanner(System.in);
		
		poke3.name = stdIn.next();
		poke3.power = stdIn.nextInt();
		poke3.difficult = stdIn.nextInt();
		
		String[] arr2 = new String[3];
		
		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		Pocketon[] myPockes = new Pocketon[3];
		myPockes[0] = poke1;
		myPockes[1] = poke2;
		myPockes[2] = poke3;
		
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].difficult);
		System.out.println(myPockes[2].power);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(myPockes[i].name);
		
		}
		myPockes[1].display();*/
		Student i = new Student();
		i.name = "藤倉一樹";
		i.no = 22;

		Student a = new Student();
		a.name = "猪琉希";
		a.no = 3;

		Student[] myfriend = new Student[3];
		myfriend[0] = i;
		myfriend[1] = a;

		for (int r = 0; r < 3; r++) {
			System.out.println(myfriend[r].name);
		}

	}
}
