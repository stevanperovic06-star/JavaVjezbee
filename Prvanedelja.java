//Pravougaonik
import java.util.Scanner;
public class Prvanedelja {

	public static void main(String[] args) {
		
		
		    
		        Scanner scanner = new Scanner(System.in);

		    
		        System.out.print("Unesite dužinu stranice a: ");
		        double a = scanner.nextDouble();

		        System.out.print("Unesite dužinu stranice b: ");
		        double b = scanner.nextDouble();

		  
		        double povrsina = a * b;
		        double obim = 2 * (a + b);

		        
		        System.out.println("Površina pravougaonika je: " + povrsina);
		        System.out.println("Obim pravougaonika je: " + obim);

		        scanner.close();
		    }
		}
//


