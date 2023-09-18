package course56;

public class PoPocke extends PoSuper implements PoAction  {

	int kotaiti;
	String nickname;
	
	public int getKotaiti() {
		return kotaiti;
	}
	public void setKotaiti(int kotaiti) {
		this.kotaiti = kotaiti;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	//これがないと使った事にならない
	public void battle() {
		
	}
	public void recover() {
		
	}
		
	

}
