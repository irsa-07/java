/**
 * Klasa PredatoryCreditCard zgjeron klasen CreditCard ne dy menyra:
 * 
 * 1) Nëse një kreditim i tentuar refuzohet sepse do të kishte tejkaluar kufirin e
      fushës limit, një tarifë prej 5 euro do te shtohet ne balancën e kartës dhe 
   
   2) do të ketë një mekanizëm për llogaritjen e tarifës mujore bazuar ne balancën e
	  kartës, duke përdorur një interes përqindjeje vjetore i specifikuar si një
	  parametër i ri ne konstruktorin e klasës.
 * 
 * @author User
 *
 */
/*fjala kyce extends krijon nje nenklase te klases CreditCard
 * Themi qe CreditCard eshte nje superklase e PredatoryCreditCard
 * dhe PredatoryCreditCard eshte nenklases e CreditCard
 * Trashegimia shton nje maredhenie qe njeihet si eshte-nje
 * Kemi qe nje PredatoryCreditCard eshte-nje CreditCard
 * Nenklasa treashegon te gjitha variablat e instances dhe metodat e superklases.
 * E vetmja gje qe nuk trashegohet eshte konstruktori i superklases.
 * Nese duam te therrasim kontruktorin e superklases duhet perdorur fjala kyce super()
 * Te gjitha variablat private te superklases mbeten te paaksesueshem tek nenklasa
 * dhe mund te aksesohen vetem npermjet metodave publike. 
 * Nese duam qe nje fushe private ta akesojem brenda nenklases duhet ta ndryshojme ne protected
 */
public class PredatoryCreditCard extends CreditCard {
 private double apr; // annual processing rate, perdoret per llogaritjen e tarifes mujore

/**
 * 
 */
public PredatoryCreditCard() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param customer
 * @param bank
 * @param account
 * @param limit
 * @param balance
 */
public PredatoryCreditCard(String customer, String bank, 
		String account, int limit, double balance, double apr) {
	
	super(customer, bank, account, limit, balance);
	this.apr = apr;
	// TODO Auto-generated constructor stub
}

/**
 * @return the apr
 */
public double getApr() {
	return apr;
}

/**
 * @param apr the apr to set
 */
public void setApr(double apr) {
	this.apr = apr;
}
@Override	
public boolean charge(double amount) {
	if(!super.charge(amount))
	{
		this.setBalance(this.getBalance()+5);
		return false;
	}
	return true;
}
/**
 * Metode e re specifike per kete klase e cila nje here ne muja aplikon nje intere mujor
 * ne baze te detyrimit qe ka klienti
 */
public void processMonthly() {
	
	double interes = Math.pow(1 + apr, 1/12.0) * getBalance();
	setBalance(interes + this.getBalance());
	
}	
}
