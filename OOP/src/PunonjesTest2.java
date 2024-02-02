
public class PunonjesTest2 {

	public static void main(String[] args) {
		Punonjes p1 = new Punonjes("Agimi", "Prifti", 500000);
		p1.setDatalindjes(new Data(17,5,2007));
		p1.getDatalindjes().afishoDaten();
		System.out.println(p1.getMosha());
	}

}
