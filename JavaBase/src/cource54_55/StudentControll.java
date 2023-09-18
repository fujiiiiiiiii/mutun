package cource54_55;

public class StudentControll {

	public static void main(String[] args) {
		Student me = new Student(22, "藤倉一樹");
		Student tonari = new Student(16, "立川竜ノ介");

		Student[] mymen = new Student[5];

		mymen[0] = me;
		mymen[1] = tonari;
		tonari.setName("杉ちゃん");

		System.out.println(mymen[0].getName());
		System.out.println(mymen[1].getName());
	}

}
