
public class TestPunonjes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punonjes denisi = new Punonjes();
		denisi.setEmri("Denis Karaj");
		denisi.setAdresa("Kodra e Diellit");
		denisi.setTelefon("0676882728");
		denisi.setEmail("deniskaraj@gmail.com");
		denisi.setZyra("Lab4");
		denisi.setPaga(900000.0);
		denisi.setDataPunesimit(new Data(12,1,2020));
		denisi.rishikoPaga();
	System.out.println(denisi);
		

	}

}
