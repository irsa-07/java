/*
 * ObjektGjeometrik r1= new Rrethi1();
 * 
 * variabli r1 eshte nje variabel reference dhe kas i tip te deklaruar ObjektGjeomterik dhe si
 * tip aktual ka klasen Rreth1
 * variali r1 quhet variabel polimorf.
 * r.toString(); do therritet metoda e tipit aktual ajo  klases Rreth1
 * 
 *   Operatori o instanceOf perdoret ne java per te treguar nese nje objekt i perket nje klase
 *   te caktuar
 *   
 *   o instanceOf 
 * 
 * 
 */
public class TestPolimorfizem {

	public static void main(String[] args) {
		ObjektGjeometrik r1= new Rrethi1();
		r1.setNgjyra("Gri");
		System.out.println(r1.toString());
		ObjektGjeometrik o;//variabel shumeformash
		o = new Trekendesh("kuqe",true,3.0,4.0,5.0);
		System.out.println(o);
		o = new Drejtkendeshi("blue",false,3.5,2.7);
		System.out.println(o);
		ObjektGjeometrik[] lista = new ObjektGjeometrik[5];
		lista[0] = new Rrethi1("verdhe",false,3.4);
		lista[1] = new Trekendesh("blue",true,3,4,6);
		lista[2] = o;
		lista[3] = new Katrori("white",false,10,10);
		lista[4] = new Drejtkendeshi();
		

	}
	public static void printSiperfaqe(ObjektGjeometrik[] lista) {
		for (ObjektGjeometrik o:lista) {
			String emri = "";
			if(o instanceof Rrethi1) emri = "e rrethit";
			else if (o instanceof Trekendesh) emri = "e trekendshit";
			else if (o instanceof Drejtkendeshi) emri="e drejtkendeshit";
			else if (o instanceof Katrori) emri="e katrorit";
			else {
				System.out.println("Objekti gjeometrik i panjohur");
				return;
			}
			System.out.println("Siperfaqja ="+ o.getSiperfaqen());
		}
	}

}
