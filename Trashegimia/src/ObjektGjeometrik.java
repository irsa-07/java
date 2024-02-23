/*
 * Kur nje klase deklarohet abstrakte, kjo klase nuk mund te inicializohet
 * Per kete rsye tek klasa TestObjektGjeometrik do merrni disa gabime
 * Klasat abstrakte mund te kene konstruktor qe mund te perodren nga nenklasa
 * Klasat abstrakte mudn te permbajne metoda abstarkt me ane te fjales kyce abstrakt
 * Metodat abstrakte deklarohen pa kod pa trupin e metodes dhe mund te implementohet duhet nga nenkalsat.
 * 
 * 
 * 
 */


import java.util.Date;

public abstract class ObjektGjeometrik extends Object {
private String ngjyra;
private boolean ngjyrosur;
private Date dataKrijimit;

/**
 * 
 * Konstruktori default
 */
public ObjektGjeometrik() {
	System.out.println("Konstruktori pa parametra i klases ObjektGjeometrik");
	this.dataKrijimit = new Date();
}
/**
 * 
 */
public ObjektGjeometrik(String ngjyra, boolean ngjyrosur) {
	this(); // therritet konstruktori default
	System.out.println("Konstruktori me parametra i klases ObjektGjeometrik");
	this.ngjyra= ngjyra;
	this.ngjyrosur = ngjyrosur;
}
/**
 * @return the ngjyra
 */
public String getNgjyra() {
	return ngjyra;
}
/**
 * @param ngjyra the ngjyra to set
 */
public void setNgjyra(String ngjyra) {
	this.ngjyra = ngjyra;
}
/**
 * @return the ngjyrosur
 */
public boolean isNgjyrosur() {
	return ngjyrosur;
}
/**
 * @param ngjyrosur the ngjyrosur to set
 */
public void setNgjyrosur(boolean ngjyrosur) {
	this.ngjyrosur = ngjyrosur;
}
/**
 * @return the dataKrijimit
 */
public Date getDataKrijimit() {
	return dataKrijimit;
}
@Override
public String toString() {
	return String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s\n", 
			getDataKrijimit(), getNgjyra(),isNgjyrosur());
}
//duhet te kete nje implementim konkret tek nenklasat,duke bere override
public abstract double getSiperfaqen();
	//getSiperfaqen() duhet te jete nje metode abtrakte


public abstract double getPerimeterin();
	
	//getPerimeter() duhet te jete nje metode abtrakte
/**
 * 
 * 
 * Llogarit perimetrin e trekendeshit
 * 
 * @return brinja1+brinja2+brinja3
 * 
 * 
 * @return
 */

}
