import java.util.Scanner;
public class Taksimetar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Unesite broj predjenih kilometara: ");
		double kilometri = scanner.nextDouble();
		
		double pocetna_cijena = 1.0;
		double  cijena_po_km = 0.5;
		double ukupna_cijena = pocetna_cijena * (cijena_po_km * kilometri);
		System.out.println("Ukupna cijena voznje je:" + ukupna_cijena + "eura");
		
	

	}

}
