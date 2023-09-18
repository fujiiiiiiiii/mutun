package course56;

public class StudentControll {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("藤倉一樹");
		stu1.setSyussekibango(22);
		stu1.study();

		PoPocke po1 = new PoPocke();
		po1.setName("ピカチュウ");
		po1.setZukanNo(25);
		po1.setType("電気");
		po1.setKotaiti(6);
		po1.setNickname("ピカピカ");
	}
}
