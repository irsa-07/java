
public class TestFakulteti {

	public static void main(String[] args) {
		Fakulteti dekani=new Fakulteti("Spirro Dushku","Tirane,"
				,"spirro@gmail.com","Kati i pare i godines A",
				null, 170000.0,new Data(1,1,1990),4,Grada.PROFESOR);
		System.out.println(dekani);
		dekani.rishikoPaga();
		System.out.println(dekani);
		

	}

}
