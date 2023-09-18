package course44;

public class UseClass {

	public static void main(String[] args) {
		Human human = new Human();
		//Humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();
		
		Animal dog = new Animal();
		dog.setName("サイ");
		dog.setWeight(7000000);
		dog.setKari("角で相手を粉砕する。");
		dog.setJumyou(30);
		dog.death(dog.getName());
		dog.display();
			
		}
		
	}


