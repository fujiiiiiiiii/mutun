package cource54_55;

public class Typhoon {
	private String typhoonbango;
	private String hasseibi;
	private String asiaName;

	//デフォルトコンストラクタ
	public Typhoon() {

	}

	//引数有りコンストラクタ

	public Typhoon(String typhoonbango, String hasseibi, String asiaName) {

		this.typhoonbango = typhoonbango;
		this.hasseibi = hasseibi;
		this.asiaName = asiaName;
	}

	//getter,setter
	public String getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(String typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
}