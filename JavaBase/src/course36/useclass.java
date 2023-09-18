package course36;

public class useclass {

	public static void main(String[] args) {

		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st.setSchool("船橋情報ビジネス専門学校");

		st.display();
		st2.display();

		Kaden ka1 = new Kaden();
		Kaden ka2 = new Kaden();

		ka1.setname("冷蔵庫");
		ka2.setname("洗濯機");
		ka1.setPrice(10000);

		ka1.display();
		ka2.display();
	}

}
