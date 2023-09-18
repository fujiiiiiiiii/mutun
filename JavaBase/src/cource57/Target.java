package cource57;

public class Target {
	private int hituyouKin;
	private int hituyouGaku;
	private int hituyouMita;
	private int hituyouOmo;

	public void takane() {
		System.out.println("筋力　" + hituyouKin);
		System.out.println("学力　" +hituyouGaku);
		System.out.println("見た目　" +hituyouMita);
		System.out.println("面白さ　" +hituyouOmo);
	}

	public int getHituyouKin() {
		return hituyouKin;
	}

	public void setHituyouKin(int hituyouoKin) {
		this.hituyouKin = hituyouKin;
	}

	public int getHituyouGaku() {
		return hituyouGaku;
	}

	public void setHituyouGaku(int hituyouGaku) {
		this.hituyouGaku = hituyouGaku;
	}

	public int getHituyouMita() {
		return hituyouMita;
	}

	public void setHituyouMita(int hituyouMita) {
		this.hituyouMita = hituyouMita;
	}

	public int getHituyouOmo() {
		return hituyouOmo;
	}

	public void setHituyouOmo(int hituyouOmo) {
		this.hituyouOmo = hituyouOmo;
	}

}
