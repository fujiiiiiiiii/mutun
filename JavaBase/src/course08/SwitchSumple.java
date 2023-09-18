package course08;

public class SwitchSumple {

	public static void main(String[] args) {
	String like = "魚";
	
	//switcth文鉄板構文
	switch(like) {
	case"魚":
	System.out.println("魚が好きです。");
	break;
	case"肉":
	System.out.println("肉が好きです。");
	break;
	default:
	System.out.println("野菜派です。");
	}
	}

}
