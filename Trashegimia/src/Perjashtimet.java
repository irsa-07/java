
/*
 * Execption ose perjashtim nga rrjedha normale e ekzekutimit te programit.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perjashtimet {

	public static void main(String[] args) {
	//gen nje gabim
		try {
			Scanner s = new Scanner(System.in);
			int n,m;
		
			System.out.print("Shkruaj nje numer te plote");
			n =  s.nextInt();
			System.out.println("Katrori i numrit eshte " + n*n);
			System.out.print("Shkruaj nje numer te plote");
			m = s.nextInt();
			System.out.println("n pjestuar me m " + n/m);
			String emri = "java";
			System.out.println(emri.charAt(100));
	//vetem  kur ka error
			} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Gabim ne input!" + e.toString());
			}catch(ArithmeticException e) {
				System.out.println("Kujdes pjestim me 0 " + e.toString());
		}catch (Exception e) {
			System.out.println("Gabim i panjohur" + e.toString());
		}
		
		System.out.println("\nFund programi");
	}

}
