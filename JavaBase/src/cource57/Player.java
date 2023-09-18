package cource57;

public class Player {
	private int kinryoku;
	private int gakuryoku;
	private int mitame;
	private int omosiro;

	public void display() {
		System.out.println("筋力　" + kinryoku);
		System.out.println("学力　" + gakuryoku);
		System.out.println("見た目　" + mitame);
		System.out.println("面白さ　" + omosiro);
	}

	public int getKinryoku() {
		return kinryoku;
	}

	public void setKinryoku(int kinryoku) {
		this.kinryoku = kinryoku;
	}

	public int getGakuryoku() {
		return gakuryoku;
	}

	public void setGakuryoku(int gakuryoku) {
		this.gakuryoku = gakuryoku;
	}

	public int getMitame() {
		return mitame;
	}

	public void setMitame(int mitame) {
		this.mitame = mitame;
	}

	public int getOmosiro() {
		return omosiro;
	}

	public void setOmosiro(int omosiro) {
		this.omosiro = omosiro;
	}

}
