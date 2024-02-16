
public class Person {
	protected String emri;
	protected String adresa;
	protected String telefon;
	protected String email;

	public Person() {
		super();
	}

	public Person(String emri, String adresa, String telefon, String email) {
		this.emri = emri;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;

	}

	/**
	 * @return the emri
	 */
	public String getEmri() {
		return emri;
	}

	/**
	 * @param emri the emri to set
	 */
	public void setEmri(String emri) {
		this.emri = emri;
	}

	/**
	 * @return the adresa
	 */
	public String getAdresa() {
		return adresa;
	}

	/**
	 * @param adresa the adresa to set
	 */
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	/**
	 * @return the telefon
	 */
	public String getTelefon() {
		return telefon;
	}

	/**
	 * @param telefon the telefon to set
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Emri: %s\nAdresa: %s\nTelefoni: %s\nEmail: %s\n",
				emri,adresa,telefon,email
				);
		
	}

}
