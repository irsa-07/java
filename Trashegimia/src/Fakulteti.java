enum Grada {
	LEKTOR, ASISTTENT_PROFESOR, PROFESOR_ASOCIUAR, DOKTOR, PROFESOR
};

public class Fakulteti extends Punonjes {
	private int oretQendrimitZyre;
	private Grada grada;

	/**
	 * @return the oretQendrimitZyre
	 */
	public Fakulteti(String emri,String adresa,String telefon,String email,String  zyra,double paga,
			Data dataPunesimit,int oretQendrimitZyre,Grada grada) {

		super(emri,adresa,telefon,email,zyra,paga,dataPunesimit);
		setOretQendrimitZyre(oretQendrimitZyre);
		this.grada=grada;
	}
	
	
	
	
	public int getOretQendrimitZyre() {
		return oretQendrimitZyre;
	}

	/**
	 * @param oretQendrimitZyre the oretQendrimitZyre to set
	 */
	public void setOretQendrimitZyre(int oretQendrimitZyre) {
		if(oretQendrimitZyre >=0)
		this.oretQendrimitZyre = oretQendrimitZyre;
	}

	/**
	 * @return the grada
	 */
	public Grada getGrada() {
		return grada;
	}

	/**
	 * @param grada the grada to set
	 */
	public void setGrada(Grada grada) {
		this.grada = grada;
	}
	@Override
	public String toString() {
		
		return super.toString()+ String.format("Grada %s\n Oret ne zyre %d\n",grada.name(),oretQendrimitZyre);
	}
	/*
	 * rishkruan metoden superklases
	 * per graden professor ,doktor dhe per profesor i asociuar pavaresisht viteve te punes aplikohet shtesa prej 
	 * 15%.per gradat e tjera aplikohet shtese prej 10% vetem ne varesi te viteve.
	 * @return true ose false kur nuk plotesohet kursi pra kriteri i viteve te punes 
	 * 
	 * 
	 * 
	 */
	@Override
	public boolean rishikoPaga() {
		
		switch(grada) {
		case PROFESOR_ASOCIUAR,
		   DOKTOR,
		    PROFESOR:
		    	this.setPaga(paga * 1.15);
		return true;
		default:
			super.rishikoPaga();
			return super.rishikoPaga();
		}
	}

}
