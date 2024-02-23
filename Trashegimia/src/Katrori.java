
public class Katrori extends Drejtkendeshi {
	private double brinja1;
	private double brinja2;

	public Katrori() {
		super();
	}

	public Katrori(String ngjyra, boolean ngjyrosur, double brinja1, double brinja2) {
		super(ngjyra, ngjyrosur, brinja1, brinja2);
		this.brinja1 = brinja2;
		

	}

	/**
	 * @return the brinja1
	 */
	public double getBrinja1() {
		return brinja1;
	}

	/**
	 * @param brinja1 the brinja1 to set
	 */
	public void setBrinja1(double brinja1) {
		this.brinja1 = brinja1;
	}
	@Override
	public double getPerimeterin() {
		return 4*brinja1;
	}
	@Override
	public double getSiperfaqen() {
		return brinja1*brinja1;
	}

	@Override
	public String toString() {
		return String.format("Katrori me brinjet %.2f,%.2f,%.2f%.2f",brinja1)+
				super.toString();
	}
	
}
