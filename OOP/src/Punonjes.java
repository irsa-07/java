/**
 * Klasa Punonjes modelon nje punonjes te nje kompanie
 * @author Ardi
 * @version 1.0
 * 
 */
public class Punonjes {
private String emri; // Emri i punonjesit
private String mbiermi; // Mbiemri i punonjesit
private double pagaMujore; // Pagen mujore te punonjesit
private boolean paga13 = false; // Paga 13 e punonjesit
private static int nrPunonjes = 0;
public Punonjes() {
	nrPunonjes++;
}
/**
 * Nderton nje objekt te klases Punonjes me parametrat e specifikuar me poshte.
 * Nese pagaMujore eshte negative, vlera defualt 0 do te vendoset
 * 
 * @param emri Emri i punonjesit
 * @param mbiemri Mbiemri i punonjesit
 * @param pagaMujore Paga mujore e punonjesit
 */
public Punonjes(String emri, String mbiemri, double pagaMujore) {
	setEmri(emri);
	setMbiermi(mbiemri);
	if(pagaMujore > 0.0) setPagaMujore(pagaMujore);
	nrPunonjes++;
}
/**
 * Metoda get per emrin e punonjesit
 * @return emri i punonjesit
 */
public String getEmri() { return emri; }
/**
 * Metoda set per fushen emri
 * @param emri Vendos emrin e punonjesit
 */
public void setEmri(String emri) {this.emri = emri;}
public String getMbiermi() {return mbiermi;}
public void setMbiermi(String mbiermi) {this.mbiermi = mbiermi;}
public double getPagaMujore() {return pagaMujore;}
public void setPagaMujore(double pagaMujore) {this.pagaMujore = pagaMujore;}
public boolean getPaga13() {return paga13;}
public void setPaga13(boolean paga13) {this.paga13 = paga13;}
/**
 * LLogarit pagen vjetore ne baze ta pages mujore.
 * @return 12 pagat plus pagen e 13 nese fusha paga13 eshte true
 */
public double getPagaVjetore() {

 return getPaga13()?getPagaMujore()*13:getPagaMujore()*12;
}	
	public static int getNrPunonjes() {
	return nrPunonjes;
}
	public static void afishoPunonjes(Punonjes punonjes) {
		
		if(punonjes!=null) System.out.printf("%-9s%-13s%11.2f\n",
				punonjes.getEmri(),
				punonjes.getMbiermi(),
				punonjes.getPagaVjetore()
				);
	}
}
