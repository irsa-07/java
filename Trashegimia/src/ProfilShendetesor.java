import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Ardi
 *
 */
public class ProfilShendetesor {
 private String emri; // emri p.sh James
 private String mbiemri; // mbiemri p.sh WaterGate
 private Data dataLindjes; // nje objekt i klases Data
 private char gjinia; // M - male, F- femaile
 private double gjatesia; // per sistemin metrik(imperial) ne m(inch) p.sh 1.80
 private double pesha; // per sistemin metrik ne kg(pound) p.sh 84.2
 private boolean sistemiMates = true; // true sistemi metrik, false sistemi imperial
 
 
public ProfilShendetesor(String emri, String mbiemri, Data dataLindjes, char gjinia, double gjatesia, double pesha) {
	
	this.emri = emri;
	this.mbiemri = mbiemri;
	this.dataLindjes = dataLindjes;
	this.gjinia = gjinia;
	this.gjatesia = gjatesia;
	this.pesha = pesha;
}

public String getEmri() {
	return emri;
}
public void setEmri(String emri) {
	this.emri = emri;
}
public String getMbiemri() {
	return mbiemri;
}
public void setMbiemri(String mbiemri) {
	this.mbiemri = mbiemri;
}
public Data getDataLindjes() {
	return dataLindjes;
}
public void setDataLindjes(Data dataLindjes) {
	this.dataLindjes = dataLindjes;
}
public char getGjinia() {
	return gjinia;
}
public void setGjinia(char gjinia) {
	this.gjinia = gjinia;
}
public double getGjatesia() {
	return gjatesia;
}
public void setGjatesia(double gjatesia) {
	this.gjatesia = gjatesia;
}
public double getPesha() {
	return pesha;
}
public void setPesha(double pesha) {
	this.pesha = pesha;
}
public boolean isSistemiMates() {
	return sistemiMates;
}
public void setSistemiMates(boolean sistemiMates) {
	this.sistemiMates = sistemiMates;
}
 
/**
 * Metoda llogarit dhe kthen moshen e pacientit
 * @return mosha ne vite e pacientit
 */
public int getMosha() {
	//to do
	// Te perdoret klasa java.util.Date ose LocalDate per te marre daten korente
	// dhe per te bere extract vitin korent. Mosha llogaritet
	// si diference midis vitit korent dhe vitit te lindjes
	Calendar cal = Calendar.getInstance();
	cal.setTime(new Date());
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	if(this.getDataLindjes().getMuaji() <= month)
	    return year - this.getDataLindjes().getViti() ;
	else 
		return year - this.getDataLindjes().getViti() - 1;
		
}

public double getMaxRrahjeve() {
	
	return 200 - getMosha();
	
}
/**
 * 
 * Llogarit diapazonin e rrahjeve te zemres 50% - 85% te maksimumit te rrahjeve
 * @return diapazonin e synuar te rrahjeve p.sh 80 - 120
 */
public String getDiapazoniRrahjeve() {
	
	return String.format("%.0f - %.0f",0.5*getMaxRrahjeve(), 0.85*getMaxRrahjeve());
}
/**
 * Llogarit BMI ne varesi te gjatesise, peshes dhe sistemit metrik
 * @return BMI
 */
public double getBMI() {
	
	return sistemiMates?getPesha()/(getGjatesia()*getGjatesia()):
		getPesha()*703/(getGjatesia()*getGjatesia());
	
}
/**
 * Printon tabelen e BMI:
 * VLERAT BMI:<br />
 * Nënpeshë: me pak se 18.5 <br />
*  Normal: midis 18.5 dhe 24.9 <br />
*  Mbipeshe: midis 25 dhe 29.9 <br />
*  Obez: 30 ose me e larte
 */
public static void printoTabelenBMI() {
	
System.out.println("VLERA BMI:");
System.out.println("Nënpeshë: me pak se 18.5");
System.out.println("Normal: midis 18.5 dhe 24.9");
System.out.println("Mbipeshe: midis 25 dhe 29.9");
System.out.println("Obez: 30 ose me e larte");
}


public void afishoProfil() {
System.out.println("****Profili Shendetesor*****");
System.out.println("Emri: "+getEmri() + " "+getMbiemri());
System.out.println("Mosha: "+getMosha());
System.out.println("Maksimumi i rrahjeve te zemres: "+getMaxRrahjeve());
System.out.println("Dipazoni i synuar i rrahjeve: "+getDiapazoniRrahjeve());
System.out.printf("BMI: %.1f\n", getBMI());
ProfilShendetesor.printoTabelenBMI();
System.out.println();
}
}



