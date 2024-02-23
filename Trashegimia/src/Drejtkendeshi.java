
public class Drejtkendeshi extends ObjektGjeometrik {
	private double brinja1 = 1.0;
	private double brinja2 = 1.0;

	public  Drejtkendeshi() {
		super();

	}

	public Drejtkendeshi(String ngjyra, boolean ngjyrosur,double brinja1,double brinja2) {
		super(ngjyra, ngjyrosur);
		this.brinja1=brinja1;
		this.brinja2=brinja2;
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

	/**
	 * @return the brinja2
	 */
	public double getBrinja2() {
		return brinja2;
	}

	/**
	 * @param brinja2 the brinja2 to set
	 */
	public void setBrinja2(double brinja2) {
		this.brinja2 = brinja2;
	}
	/*
	 * Perimetri
	 * 
	 */
	@Override
	public double getPerimeterin() {
		return (brinja1+brinja2)*2;
	}
	@Override
	public double getSiperfaqen() {
		return brinja1*brinja2;
	}

	@Override
	public String toString() {
		
		return String.format("Drejtkendeshi me brinjet %.2f%.2f",brinja1,brinja2) + 
				super.toString();
	}
	
}

