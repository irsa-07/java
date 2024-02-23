
public class TrekendeshTest {

	public static void main(String[] args) {
		try {
			Trekendesh t1 = new Trekendesh();
			t1.setNgjyra("jeshile");
			t1.setNgjyrosur(true);
			System.out.println(t1);
			System.out.println("----------------");
			Trekendesh t2=new Trekendesh("kuqe",true,3,4,5);
			System.out.println(t2);
			System.out.println("Perimetri i t2 = " + t2.getPerimeterin());
			System.out.println("Siperfaqja e t2 = "+ t2.getSiperfaqen());
			
			Trekendesh t3 =  new Trekendesh("Kuqe",true,-1,0,5);
			System.out.println(t3.toString());
		} catch (IllegalArgumentException  e) {
			// TODO Auto-generated catch block
			System.out.println("Gabim! \n" + e.getMessage());
		}

	}

}
