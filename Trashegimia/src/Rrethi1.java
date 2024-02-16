
import java.lang.Math;
/*
 * Klasa rreth zgjeorn klasen objekt gjeometrik,pasi nje rreth eshte nje objekt
 * gjeometrik.Rrethi ka fushen rrezja te tipi double me vlere default 1.0
 * Ka metodat getPerimeter dhe get Siperfaqen.
 * Perimetri= 2 * pi * rrezja
 * Siperfaqja= rrezja *rrezja * pi
 * 
 * 
 * 
 * 
 */
public class Rrethi1 extends ObjektGjeometrik {
	private double rrezja = 1.0;

	public Rrethi1() {
		super();

	}

	public Rrethi1(String ngjyra, boolean ngjyrosur,double rrezja) {
		super(ngjyra, ngjyrosur);
		this.rrezja=rrezja;
		
	}

	/**
	 * @return the rrezja
	 */
	public double getRrezja() {
		return rrezja;
	}

	/**
	 * @param rrezja the rrezja to set
	 */
	public void setRrezja(double rrezja) {
		this.rrezja = rrezja;
	}
	
	/*
	 * Llogarisim perimetrin e rrethit
	 * @return perimetrin
	 * 
	 *
	 */
	
	public double getPerimeter() {
		return Math.PI*2*rrezja;
	}
//siperfaqja
	public double getSiperfaqen() {
		return Math.PI*rrezja*rrezja;
	}

	@Override
	public String toString() {
		
		return String.format("Rrethi me rreze %.2f" ,rrezja)+
				super.toString();
	}

	
	}
	

