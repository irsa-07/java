/**
 * enum shkurtim i enumerator edhe eshte nje shkurtim per te krijuar nje liste
 * me konstante enum emriEnumaerator {lista e konstanteve te ndara me presje};
 * per ditet e javes,per muajt
 * 
 * @author irsa
 * 
 */

enum Status {
	VITIPARE, VITIDYTE, BACHELOR, MASTER
};

public class Student extends Person {
	private Status status;

	public Student(String emri, String adresa, String telefon, String email, 
			Status status) {
		super(emri, adresa, telefon, email);
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Statusi: %s\n", status.name()) + super.toString();

	}

}
