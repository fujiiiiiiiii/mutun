package course46_47;

public class UseClass {

	public static void main(String[] args) {
		Cat tama = new Cat();

		tama.setName("たま");
		tama.setShurui("三毛猫");
		tama.setSize("30cmぐらい");

		tama.eat("猫缶");
		tama.run();

		tama.display();

		Dentaku a = new Dentaku();
		a.calc(1, 2);
	}

}
